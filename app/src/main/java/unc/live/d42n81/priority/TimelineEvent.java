package unc.live.d42n81.priority;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimelineEvent {

    private LocalDateTime eventDate;
    private String name;
    private String desc;
    private long priority;

    //Most options for constructor
    public TimelineEvent(int month, int day, int year, int hour, int minute,
                         String name, String desc) {
        this.eventDate = (LocalDate.of(year, month, day)).atTime(hour, minute);
        this.name = name;
        this.desc = desc;
        this.priority = calculatePriority(this.eventDate);
    }

    //Assumes current day
    public TimelineEvent(int hour, int minute, String name, String desc){
        this.eventDate = (LocalTime.of(hour, minute, 0)).atDate(LocalDate.now());
        this.name = name;
        this.desc = desc;
        this.priority = calculatePriority(this.eventDate);
    }

    public String getName(){
        LocalTime time = new LocalTime();
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }

    public long getPriority(){
        return this.priority;
    }

    public long updatePriority(){
        this.priority = calculatePriority(this.eventDate);
    }

    private long calculatePriority(LocalDateTime event){
        LocalDateTime current = LocalDateTime.now();
        return (ChronoUnit.DAYS.between(event, current)*1440);
    }
}

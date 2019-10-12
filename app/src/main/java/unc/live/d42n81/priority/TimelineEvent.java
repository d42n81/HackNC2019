package unc.live.d42n81.priority;

import java.time.LocalDateTime;

public class TimelineEvent {

    private LocalDateTime eventDate;
    private String name;
    private String desc;
    private int priority;

    public TimelineEvent(LocalDateTime eventDate, String name, String desc){
        this.eventDate = eventDate;
        this.name = name;
        this.desc = desc;
        this.priority = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }

    public int getPriority(){
        return this.priority;
    }
}

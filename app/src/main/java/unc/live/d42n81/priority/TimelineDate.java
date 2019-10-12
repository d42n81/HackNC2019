package unc.live.d42n81.priority;

import java.time.LocalDateTime;

public class TimelineDate {

    LocalDateTime eventDate;
    String name;
    String desc;

    public TimelineDate(LocalDateTime eventDate, String name, String desc){
        this.eventDate = eventDate;
        this.name = name;
        this.desc = desc;
    }
}

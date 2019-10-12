package unc.live.d42n81.priority;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Stream {
    // String blue = "" + android.R.color.holo_blue_bright;
    // priority closer to 0 is most important.

    PriorityQueue<TimelineEvent> timelinePriorityQueue = new PriorityQueue<TimelineEvent>(5, new PriorityComparator());
    int lengthOfPriorityQueue;

    ArrayList<TimelineEvent> arrayListOfEvents = new ArrayList<TimelineEvent>(5);
    TimelineEvent[] arrayOfEvents;

//    = timelinePriorityQueue.toArray();

    public Stream () {
        // color?
        this.lengthOfPriorityQueue = 0;
    }

    public void addEvent(TimelineEvent e) {
        this.timelinePriorityQueue.add(e);
        this.lengthOfPriorityQueue++;
        this.arrayListOfEvents.add(e);
    }

    public TimelineEvent removeHead() {
        TimelineEvent event = this.timelinePriorityQueue.poll();
        this.arrayListOfEvents.remove(event);
        this.lengthOfPriorityQueue--;
        return event;
    }

    public TimelineEvent[] makeArrayFromPriorityQueue() {
        this.arrayOfEvents = new TimelineEvent[this.lengthOfPriorityQueue];
        for (int i = 0; i < arrayOfEvents.length; i++) {
            this.arrayOfEvents[i] = this.arrayListOfEvents.get(i);
        }
        return this.arrayOfEvents;
    }


}

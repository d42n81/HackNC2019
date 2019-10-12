package unc.live.d42n81.priority;

import java.util.Comparator;

public class PriorityComparator implements Comparator<TimelineEvent> {
    public int compare(TimelineEvent t1, TimelineEvent t2)
    {
         if(t1.getPriority() < t2.getPriority()) {
             // t1 is more important
             return -1;
         } else if (t1.getPriority() > t2.getPriority()) {
             return 1;
         } else {
             return 0;
         }
    }
}

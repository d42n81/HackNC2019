package unc.live.d42n81.priority;

import java.util.ArrayList;

public class Timeline {

    ArrayList<Stream> streams = new ArrayList<Stream>();
    // TODO encapulsate scale of timeline. Either 12 hours, 7 days, 4 weeks, etc. Use that value to figure out
    int startHour = 0;
    int endHour = 0;
    int scroll = 0;

    public Timeline() {
        // Make a Stream();
        Stream firstStream = new Stream();
        this.streams.add(firstStream);
    }

    public void addEvent(Stream s, int percentOfScale) {
        // get scale. Take 1/ percentage of scale and multiply by scale.
        // Add event to stream with that time mapped from scale click,
    }

    public ArrayList<Stream> getStreams() { return this.streams; }

    public ArrayList<Stream> setStreams(ArrayList<Stream> newStreams) {
        this.streams = newStreams;
        return this.streams;
    }
}

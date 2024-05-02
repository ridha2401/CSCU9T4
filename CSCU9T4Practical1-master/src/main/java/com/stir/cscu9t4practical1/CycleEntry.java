package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
    private String terrain;
    private String tempo;

    // Constructor
    public CycleEntry(String name, int day, int month, int year, int hour, int min, int sec, float distance, String terrain, String tempo) {
        super(name, day, month, year, hour, min, sec, distance);
        this.terrain = terrain;
        this.tempo = tempo;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getTempo() {
        return tempo;
    }

    @Override
    public String getEntry() {
        // Uses the getDateTimeString() from the Entry superclass
        return String.format("%s cycled %s km in %s on %s at %s tempo\n", getName(), getDistance(), getDateTimeString(), terrain, tempo);
    }
}

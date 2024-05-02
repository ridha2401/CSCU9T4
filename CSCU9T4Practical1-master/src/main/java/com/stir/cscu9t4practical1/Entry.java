package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class Entry {
    private String name;
    private Calendar dateAndTime;
    private float distance;
    
    public Entry(String n, int d, int m, int y, int h, int min, int s, float dist) {
        name = n;
        Calendar inst = Calendar.getInstance();
        // Calendar months are zero-indexed, adjust by subtracting 1 from month
        inst.set(y, m - 1, d, h, min, s);
        dateAndTime = inst;
        distance = dist;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDay() {
        return dateAndTime.get(Calendar.DATE);
    }
    
    public int getMonth() {
        // Return the month as 1-indexed
        return dateAndTime.get(Calendar.MONTH) + 1;
    }
    
    public int getYear() {
        return dateAndTime.get(Calendar.YEAR);
    }
    
    public int getHour() {
        return dateAndTime.get(Calendar.HOUR_OF_DAY); // Use HOUR_OF_DAY for 24-hour format
    }
    
    public int getMin() {
        return dateAndTime.get(Calendar.MINUTE);
    }
    
    public int getSec() {
        return dateAndTime.get(Calendar.SECOND);
    }
    
    public float getDistance() {
        return distance;
    }
    
    public String getDateTimeString() {
        return String.format("%d:%d:%d on %d/%d/%d", getHour(), getMin(), getSec(), getDay(), getMonth(), getYear());
    }
    
    public String getEntry() {
        return String.format("%s ran %s km in %s\n", getName(), getDistance(), getDateTimeString());
    }
}

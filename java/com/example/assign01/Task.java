package com.example.assign01;

import java.io.Serializable;

public class Task implements Serializable {
    String reading = "";
    String writing = "";
    String running = "";

    public void setReading(String reading) {
        this.reading = reading;
    }
    public void setWriting(String writing) {
        this.writing = writing;
    }
    public void setRunning(String running) {
        this.running = running;
    }

    public String getReading() {
        return reading;
    }
    public String getWriting() {
        return writing;
    }
    public String getRunning() {
        return running;
    }
}

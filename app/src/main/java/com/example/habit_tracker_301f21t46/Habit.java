package com.example.habit_tracker_301f21t46;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Habit {
    private String title;
    private String reason;
    private String startDate;
    private boolean completed;
    private String habitID;
    private HabitEvent habitEvent;
    private ArrayList<String> days_of_week;

    public Habit(String title, String reason, String startDate, String habitID, ArrayList<String> days_of_week){
        this.title = title;
        this.reason = reason;
        this.startDate = startDate;
        this.habitID = habitID;
        this.completed = false; //TODO this needs to be reset at the beginning of everyday in the habit plan
        this.habitEvent = new HabitEvent();
        this.days_of_week = days_of_week;
    }

    //----- Getters and Setters -----
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getHabitID() { return habitID; }
    public void setHabitID(String habitID) { this.habitID = habitID; }
    public HabitEvent getHabitEvent() { return habitEvent; }
    public ArrayList<String> getDays_of_week() { return days_of_week; }
    public void setDays_of_week(ArrayList<String> days_of_week) { this.days_of_week = days_of_week; }
}

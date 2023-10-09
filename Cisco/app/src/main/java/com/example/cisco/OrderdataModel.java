package com.example.cisco;

public class OrderdataModel {
    String category;
    String goal;
    String booking;

    public OrderdataModel(String category, String goal, String booking) {
        this.category = category;
        this.goal = goal;
        this.booking = booking;
    }

    public String getCategory() {
        return category;
    }

    public String getGoal() {
        return goal;
    }

    public String getBooking() {
        return booking;
    }
}

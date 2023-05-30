package com.solvd.Enums;

public enum DaysOfFlights {
    MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat"), SUNDAY("Sun");

    private String abbreviation;

    // Constructor
    DaysOfFlights(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    // Getter method
    public String getAbbreviation() {
        return abbreviation;
    }

    // Custom method
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

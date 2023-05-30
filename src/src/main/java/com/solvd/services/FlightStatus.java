package com.solvd.services;

import com.solvd.Enums.DaysOfFlights;
import com.solvd.Interfaces.ICanCancel;
import com.solvd.exceptions.BadFlightStatusException;

import static com.solvd.Main.LOGGER;

public class FlightStatus implements ICanCancel {

    public static void main(String [] args){
        int goodFlight = 10;
        goodFlight(10);
    }

    private static void goodFlight(int goodFlight) {
        if (goodFlight < 10){
            try {
                throw new BadFlightStatusException();
            } catch (BadFlightStatusException e) {
                throw new RuntimeException(e);
            }
        }
    }
        public static String getFlightSchedule() {
            DaysOfFlights today = DaysOfFlights.MONDAY;

            LOGGER.info("Today is: " + today);
            LOGGER.info("Abbreviation: " + today.getAbbreviation());
            LOGGER.info("Is weekend? " + today.isWeekend());

            LOGGER.info("Enum values:");
            for (DaysOfFlights day : DaysOfFlights.values()) {
                LOGGER.info(day + " (" + day.getAbbreviation() + ")");

                if (day == DaysOfFlights.SUNDAY) {
                    LOGGER.info("No available flights today. Closed on Sundays");
                }
            }
            return null;
        }


    public static void cancel() {

        LOGGER.info("The flights can get cancelled.");
    }
    String flightStanding;
    String FlightStanding = flightStanding;


    public String getFlightStanding() {

        return flightStanding;
    }

    public void setFlightStanding(String flightStanding) {

        this.flightStanding = flightStanding;
    }
}

package com.solvd.entities;
import com.solvd.Enums.LuggageSize;
import com.solvd.Enums.Ratings;
import com.solvd.Interfaces.IBookable;
import com.solvd.exceptions.FlightFullException;
import static com.solvd.Main.LOGGER;

public class Flight implements IBookable {

    private static void flightFull(int i) {
        flightFull(290);
        if (i > 290) {
            try {
                throw new FlightFullException();
            } catch (FlightFullException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static String[] miamiFlights = {" [1] 2:45pm", "[2] 3:20pm"};
    public static String[] laFlights = {" [1] 6:25pm", " [2] 7:30pm"};
    public static String[] denverFlights = {" [1] 11:45am", " [2] 2:30pm"};
    public static String[] houstonFlights = {" [1] 10:20am", " [2] 5:30pm"};


    public static void booked() {
        LOGGER.info("The flights can be all booked.");

    }
}

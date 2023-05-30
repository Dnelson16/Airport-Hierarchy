package com.solvd.entities;

import java.util.HashMap;

import static com.solvd.Main.LOGGER;

//import static com.solvd.Main.logger;

public class Boeing extends Plane {

    public static void employeeIDS() {
        HashMap< Integer, String> empIDs = new HashMap<>();
        empIDs.put(12, "John Perry");
        empIDs.put(23, "Jerry Springer");
        empIDs.put(54, "Julian Thomas");
        empIDs.put(2, "Paul Hunter");

        LOGGER.info(String.valueOf(empIDs));
    }

    static int tailNumber1 = 301;

        static
        {
            tailNumber1 = 301;
            LOGGER.info("The Employee numbers are: ");
    }

    public Boeing(int i, String delta) {
        super();
    }

    public int getTailNumber1() {
        return tailNumber1;
    }

    public void setTailNumber1(int tailNumber1) {
        this.tailNumber1 = tailNumber1;
    }

}



package com.solvd.services;

import static com.solvd.Main.LOGGER;

public class TransportationSecurity {

    private final String name;
    private String information;

    public TransportationSecurity(String name,String information){
        this.name = name;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }
    public void metalDetectors(){
        LOGGER.info("You will walk through a metal detector.");
    }
    private void bombDogs(){
        LOGGER.info("There will be bomb dogs.");
    }
    public static void xrayMachine(){
        LOGGER.info("Your personal items go through an xray machine.");
    }
    private static void proofOfID(){
        LOGGER.info("You will need proof of identification");
    }
}


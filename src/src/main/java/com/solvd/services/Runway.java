package com.solvd.services;

import com.solvd.exceptions.RunwayFullException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Supplier;

import static com.solvd.Main.LOGGER;

public class Runway<E> {
    private String name;
    private LinkedList<E> codes;

    public Runway(String name) {
        this.name = name;
        codes = new LinkedList<>();
    }
    public void runwayCode(E code){
        codes.add(code);
    }
    public void printCodes() {
        for (E code : codes);
        LOGGER.info((Supplier<String>) codes);
    }

    private static void planesOnRunway(int planesOnRunway) throws RunwayFullException {
        planesOnRunway(6);
        if (planesOnRunway > 10) {
            throw new RunwayFullException("The Runways are full");

        }
        LinkedList<String> runwayLinkedList = new LinkedList<>();
        runwayLinkedList.add("Alpha");
        runwayLinkedList.add("Beta");
        runwayLinkedList.add("Charlie");
        runwayLinkedList.add("David");
        runwayLinkedList.add("Edward");
        runwayLinkedList.add("Frank");
        Iterator iterator = runwayLinkedList.iterator();
        while (iterator.hasNext()) {
            LOGGER.info("Runway" + " " + iterator.next());

        }
    }

    protected String runwayID;

    public Runway(String name, String location, String runwayID){
        super();
        this.runwayID = runwayID;
    }

    public String getRunwayID() {
        return runwayID;
    }

    public void setRunwayID(String runwayID) {
        this.runwayID = runwayID;
    }
}

package com.solvd.entities;
import com.solvd.exceptions.PilotsOnDutyException;
import java.util.HashSet;
import java.util.Set;

public class Pilot extends Employee {

    private static void clockedInPilots(int clockedInPilots ) throws PilotsOnDutyException {
        clockedInPilots(17);
        if (clockedInPilots < 17){
            throw new PilotsOnDutyException("Call in more pilots");
        }
        Set<Object> pilotNames = new HashSet<>();
        pilotNames.add("Joey");
        pilotNames.add("Harry");
        pilotNames.add("Jim");
        pilotNames.add("Alex");
        pilotNames.add("Sergey");
        System.out.println("Pilot Names: ");
        pilotNames.forEach((p) -> {
            System.out.println(p);
        });
    }

    private String pilotName;
    private int employeeNumber;
    public Pilot(String name, String location ){
        super(name,location);
        this.pilotName = pilotName;
        this.employeeNumber = employeeNumber;

    }

    public String getPilotName() {

        return pilotName;
    }

    public void setPilotName(String pilotName) {

        this.pilotName = pilotName;
    }

    public int getEmployeeNumber() {

        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {

        this.employeeNumber = employeeNumber;
    }
}

package com.solvd.services;

import com.solvd.entities.Employee;
import java.util.HashSet;
import java.util.Set;



public class AirportManagment extends Employee {

    private String employeeType;

    public AirportManagment(String name, String location) {
        super(name, location);
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public static void mgmtPositions() {
        Set<String> mgmtPositions = new HashSet<>();
        mgmtPositions.add("Supervisor");
        mgmtPositions.add("Manager");
        mgmtPositions.add("Shift Leader");
        mgmtPositions.add("Lead Runway Technician");
        System.out.println(mgmtPositions);

    }


}
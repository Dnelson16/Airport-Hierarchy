package com.solvd.entities;

import com.solvd.Interfaces.IWorkable;

import java.util.HashMap;
import java.util.Iterator;

import static com.solvd.Main.LOGGER;

public class Employee implements IWorkable {


    public static void works(){
        LOGGER.info ("Employees can work.");
    }

    public String generalEmployee;
    private int id;
    private String name;



    public Employee(String name, String location) {
    }


    public String getGeneralEmployee() {
        return generalEmployee;
    }

    public void setGeneralEmployee(String generalEmployee) {
        this.generalEmployee = generalEmployee;
    }
}

package com.solvd.entities;
import com.solvd.Interfaces.IBookable;



public class Airport implements IBookable {
    private String name;
    private String location;

    public Airport(String name, String location) {
        this.name = name;
        this.location = location;
    }


    @Override
    public String toString() {
        return name +" "+ location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }


}

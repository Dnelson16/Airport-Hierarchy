package com.solvd.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.solvd.Main.LOGGER;


public class Plane  {

    public String name;
    public int age = 300;
    public static String pilot2;

    public Plane() {}

    public void print() {
        System.out.println("System check is good, the plane will fly");

    }
    List<Integer> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> evenSeats
            = arr.stream().reduce(new ArrayList<Integer>(),
            (a, b)
                    -> {
                if (b % 2 == 0)
                    a.add(b);
                return a;
            },
            (a, b) -> {
                a.addAll(b);
                return a;
            });

    public static void planeNumber(){
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(22);
        numberArrayList.add(27);
        numberArrayList.add(53);
        numberArrayList.add(90);
        numberArrayList.add(76);
        Iterator iterator = numberArrayList.iterator();
        while (iterator.hasNext()){
            LOGGER.info("Plane" + " " + iterator.next());
    }
   }

    public static String tailCode() {

        String startup = null;
        return startup;
       }
//
//    public boolean willTurnOn() {
//        return true;
//    }
//
//    public boolean willFly() {
//        return true;
//    }
//
//    public boolean willDrive() {
//        return false;
//    }

    }



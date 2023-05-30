package com.solvd.entities;

import com.solvd.Enums.LuggageSize;

import java.util.Scanner;

import static com.solvd.Main.LOGGER;



public class Passenger {

    static LuggageSize luggageSize;
    public Passenger(LuggageSize luggageSize) {
        this.luggageSize = luggageSize;
    }
    public static void selectLuggage() {

//        LOGGER.info("What size bag will you be bringing?");
//        LOGGER.info(" Personal");
//        LOGGER.info(" Backpack");
//        LOGGER.info(" Large Bag");
//        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//


        switch (luggageSize) {
            case PERSONAL:
                LOGGER.info("I'm bringing a personal item.");
                break;
            case BACKPACK:
                LOGGER.info("I'm bringing a backpack.");
                break;
            case LARGEBAG:
                LOGGER.info("I'm bringing a large bag. ");
        }
    }

    public static void childrenTickets() {
        Scanner scanner = new Scanner(System.in);
        int childPrice = 50;
        LOGGER.info("How many children are Flying? ------ max 9 tickets per customer");
        LOGGER.info("[1] [2] [3] [4] [5] [6] [7] [8] [9]");
        int option = scanner.nextInt();
        int childTotal = (childPrice * option);
        LOGGER.info("Child tickets will be" + "  " + childTotal + "  " + "US dollars");

    }
    public static void adultTickets(){
        Scanner scanner = new Scanner(System.in);
        int adultPrice = 100;
        LOGGER.info("How many adults are Flying? ------ max 9 tickets per customer");
        LOGGER.info("[1] [2] [3] [4] [5] [6] [7] [8] [9]");
        int option2 = scanner.nextInt();
        int adultTotal = (adultPrice * option2);
        LOGGER.info("Adult tickets will be approx"+"  " + adultTotal +"  "+"US dollars");
    }
}


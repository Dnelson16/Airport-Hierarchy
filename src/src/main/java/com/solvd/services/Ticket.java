package com.solvd.services;

import com.solvd.Interfaces.IBuyable;
import com.solvd.entities.Flight;
import com.solvd.entities.Passenger;
import com.solvd.exceptions.TicketPriceBelowZeroException;

import java.util.Arrays;
import java.util.Scanner;


import static com.solvd.Main.LOGGER;



public class Ticket implements IBuyable {

    private int Price;

    public void main(String[] args){
        int price = 100;
        price(100); 
                
        int childrenPrice = 100;
         int adultPrice = 50;
    }
    private void price(int price){
        if (price < 100){
            try {
                throw new TicketPriceBelowZeroException();
            } catch (TicketPriceBelowZeroException e) {
                throw new RuntimeException(e);
            }

        }

        this.Price = price;
    }
    public static void welcomeMessage() {
        LOGGER.info("Welcome to Dylan's International Airport.");
    }
    public static void thankYouMessage() {
        LOGGER.info("Thank you for choosing Dylan's International! Have a great day!");
    }

        public static void flightOptions() {
            LOGGER.info("Where Would You Like to fly?");
            LOGGER.info("[1] Miami FL");
            LOGGER.info("[2] Los Angeles CA");
            LOGGER.info("[3] Denver CO");
            LOGGER.info("[4] Houston TX");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();



            switch (value) {

                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    LOGGER.info("Here are the flights to Miami");
                    LOGGER.info(Arrays.toString(Flight.miamiFlights));
                    LOGGER.info("Which flight would you like to book?");
                    int choice1 = scanner1.nextInt();
                    Passenger.childrenTickets();
                    Passenger.adultTickets();
                    break;

                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    LOGGER.info("Here are the flights to LA");
                    LOGGER.info(Arrays.toString(Flight.laFlights));
                    LOGGER.info("Which flight would you like to book?");
                    int choice2 = scanner2.nextInt();
                    Passenger.childrenTickets();
                    Passenger.adultTickets();
                    break;

                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    LOGGER.info("Here are the flights to Denver");
                    LOGGER.info(Arrays.toString(Flight.denverFlights));
                    LOGGER.info("Which flight would you like to book?");
                    int choice3 = scanner3.nextInt();
                    Passenger.childrenTickets();
                    Passenger.adultTickets();
                    break;

                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    LOGGER.info("Here are the flights to Houston");
                    LOGGER.info(Arrays.toString(Flight.houstonFlights));
                    LOGGER.info("Which flight would you like to book?");
                    int choice4 = scanner4.nextInt();
                    Passenger.childrenTickets();
                    Passenger.adultTickets();
                    break;
            }

        }

    @Override
    public int Search(Object item, Object[] items) {
        return 0;
    }
}

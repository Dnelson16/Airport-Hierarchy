package com.solvd;

import com.solvd.Enums.LuggageSize;
import com.solvd.Enums.Ratings;
import com.solvd.Interfaces.ITaxable;
import com.solvd.entities.Passenger;
import com.solvd.services.*;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {

    public static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {

        FlightStatus flightSchedule = new FlightStatus();
        String schedule = flightSchedule.getFlightSchedule();
        LOGGER.info("Flight Schedule: " + schedule);

        performPassengerOperations();
        performNumbersOperations();
        performJobsOperations();
        performEmployeeOperations();
        performFlightRatingsOperations();
        getTaxes();
        performTicketOperations();

        }

        private static void performPassengerOperations() {
            Passenger p1 = new Passenger(LuggageSize.PERSONAL);
            Passenger.selectLuggage();

            Passenger p2 = new Passenger(LuggageSize.BACKPACK);
            Passenger.selectLuggage();

            Passenger p3 = new Passenger(LuggageSize.LARGEBAG);
            Passenger.selectLuggage();
        }

        private static void performNumbersOperations() {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);

            int sumOfNumbers = numbers.stream().mapToInt(Integer::intValue).sum();
            LOGGER.info("Sum: " + sumOfNumbers);

            List<Integer> filteredNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
            LOGGER.info("Filtered Numbers: " + filteredNumbers);
        }

        private static void performJobsOperations() {
            Set<Object> jobs = Set.of("Pilot", "Flight attendant", "Co-Pilot", "Security");

            int numJobs = jobs.size();
            LOGGER.info("Number of Jobs: " + numJobs);

            Set<Object> uppercasedJobs = new HashSet<>(jobs);
            LOGGER.info("Uppercased Jobs: " + uppercasedJobs);
        }

        private static void performEmployeeOperations() {
            HashMap<Integer, Object> empIDs = new HashMap<>();
            empIDs.put(12, "John Perry");
            empIDs.put(23, "Jerry Springer");
            empIDs.put(54, "Julian Thomas");
            empIDs.put(2, "Paul Hunter");

            LOGGER.info("Employee IDs: ");
            empIDs.forEach((n, i) -> {
                LOGGER.info(n + " " + i);
                empIDs.toString();
            });

            Set<Integer> allNumbers = empIDs.keySet();
            LOGGER.info("All Numbers: " + allNumbers);

            Collection<Object> allNames = empIDs.values();
            LOGGER.info("All Names: " + allNames);
        }

    private static String performFlightRatingsOperations() {
        System.out.println();
        LOGGER.info("Rating of flights");
        LOGGER.info("Delta: " + Ratings.Delta.flightRatings);
        LOGGER.info("Spirit: " + Ratings.Spirit.flightRatings);
        LOGGER.info("Frontier: " + Ratings.Frontier.flightRatings);
        LOGGER.info("American: " + Ratings.American.flightRatings);

        return "Flight Ratings: Delta - " + Ratings.Delta.flightRatings + ", Spirit - " + Ratings.Spirit.flightRatings
                + ", Frontier - " + Ratings.Frontier.flightRatings + ", American - " + Ratings.American.flightRatings;

    }
    private static void getTaxes() {
        ITaxable<Float> refIValue;
        refIValue = () -> 17.50f;
        float t = refIValue.getTaxes();
        LOGGER.info("Taxes = " + t);
    }
    private static void performTicketOperations() {
            System.out.println();
            Ticket.welcomeMessage();
            System.out.println();
            Ticket.flightOptions();
            System.out.println();
            Ticket.thankYouMessage();
        }
    }

//        Runnable runnable1 = new MyRunnable("Thread 1");
//        Thread thread1 = new Thread(runnable1);
//        thread1.start();
//
//        Thread thread2 = new MyThread("Thread 2");
//        thread2.start();
//
//        ConnectionPool connectionPool = ConnectionPool.getInstance();
//
//        // Single thread loading of connection pool
//        int MAX_POOL_SIZE = 5;
//        for (int i = 0; i < MAX_POOL_SIZE; i++) {
//            CompletableFuture<Connection> future = connectionPool.getConnection();
//            future.thenAcceptAsync(connection -> {
//                LOGGER.info("Thread " + Thread.currentThread().getId() +
//                        " acquired " + connection);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                connectionPool.releaseConnection(connection);
//                LOGGER.info("Thread " + Thread.currentThread().getId() +
//                        " released " + connection);
//            });
//        }
//
//        // Thread pool loading of connection pool
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        for (int i = 0; i < 7; i++) {
//            CompletableFuture<Connection> future = connectionPool.getConnection();
//            future.thenAcceptAsync(connection -> {
//                LOGGER.info("Thread " + Thread.currentThread().getId() +
//                        " acquired " + connection);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                connectionPool.releaseConnection(connection);
//                LOGGER.info("Thread " + Thread.currentThread().getId() +
//                        " released " + connection);
//            });
//
//        }
//        executorService.shutdown();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        Menu flightSchedule = new Menu();
//        String schedule = flightSchedule.getFlightSchedule();
//        LOGGER.info("Flight Schedule: " + schedule);
//
//        Passenger p1 = new Passenger(LuggageSize.PERSONAL);
//        Passenger.selectLuggage();
//
//        Passenger p2 = new Passenger(LuggageSize.BACKPACK);
//        Passenger.selectLuggage();
//
//        Passenger p3 = new Passenger(LuggageSize.LARGEBAG);
//        Passenger.selectLuggage();
//
//        Menu.getTaxes();
//
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//// Terminal Operation
//        int sumOfNumbers = numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("Sum: " + sumOfNumbers);
//// Non-terminal Operation
//        List<Integer> filteredNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        LOGGER.info("Filtered Numbers: " + filteredNumbers);
//
//
//        Set<Object> jobs = Set.of("Pilot", "Flight attendant", "Co-Pilot", "Security");
//
//// Terminal Operation
//        int numJobs = jobs.size();
//        LOGGER.info("Number of Jobs: " + numJobs);
//
//// Non-terminal Operation
//        Set<Object> uppercasedJobs = new HashSet<>(jobs);
//        LOGGER.info("Uppercased Jobs: " + uppercasedJobs);
//
//        Consumer<Object> flightBooked = message -> LOGGER.info(message.toString());
//        flightBooked.accept("A flight has been booked.");
//
//        Predicate<Integer> carryOnPrice = i -> (i < 25);
//        LOGGER.info(String.valueOf(carryOnPrice.test(10)));
//
//        Airport evenSeats = null;
//        LOGGER.info(evenSeats.toString());
//
//
//        HashMap<Integer, Object> empIDs = new HashMap<>();
//        empIDs.put(12, "John Perry");
//        empIDs.put(23, "Jerry Springer");
//        empIDs.put(54, "Julian Thomas");
//        empIDs.put(2, "Paul Hunter");
//        LOGGER.info("Employee IDs: ");
//        empIDs.forEach((n, i) -> {
//            LOGGER.info(n + " " + i);
//            empIDs.toString();
//        });
//
//// Terminal Operation
//        Set<Integer> allNumbers = empIDs.keySet();
//        LOGGER.info("All Numbers: " + allNumbers);
//
//// Non-terminal Operation
//        Collection<Object> allNames = empIDs.values();
//        LOGGER.info("All Names: " + allNames);
//
//
//        IBuyable<Object> ref;
//        ref = (item, items) -> {
//            int count = 0;
//            for (int i = 0; i < items.length; i++)
//                if (item == items[i])
//                    count++;
//            return count;
//        };
//
//        Terminal terminal = Terminal.ONE;
//        if (terminal == Terminal.ONE) {
//            LOGGER.info("Terminal One: Delta Flights");
//        }
//
//        LOGGER.info("Some debug log");
//        LOGGER.info("Pilot2: " + pilot2);
//        LOGGER.info("Plane1: " + pilot2);
//        LOGGER.info("Warning accrued at " + tailCode());
//        LOGGER.info("Error accrued at " + tailCode());
//        LOGGER.info("Serious problem with plane " + pilot2 + " accrued at " + tailCode());
//        System.out.println();
//
//
//            System.out.println();
//            Ticket.welcomeMessage();
//            System.out.println();
//            Ticket.flightOptions();
//            System.out.println();
//            Ticket.thankYouMessage();
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//

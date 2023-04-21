public class Main {
    public static void main(String[] args){
        Airport airport= new Airport("Dylan's Airport", "123 State St");

        AirportManagment administration =  new AirportManagment(airport.getName(), airport.getLocation());
        AirportManagment generalEmployee = new AirportManagment(airport.getName(), airport.getLocation());

        Employee employee1 = new Employee(airport.getName(), airport.getLocation(), "Branson Harrison");
        Employee employee2 = new Employee(airport.getName(), airport.getLocation(), "Matt Kulka");

        Passenger passenger1 = new Passenger(airport.getName(), airport.getLocation(), 1, "Derek Guzzo" );
        Passenger passenger2 = new Passenger(airport.getName(), airport.getLocation(), 2, "Andre Rodriguez" );

        Pilot pilot1 = new Pilot(airport.getName(), airport.getLocation(), "Dylan Nelson", "Chief Airman");
        Pilot pilot2 = new Pilot(airport.getName(), airport.getLocation(), "Bobby Harrison","Reserve Airman");
        Pilot pilot3 = new Pilot(airport.getName(), airport.getLocation(), "Isom Julian", "Co-Airman");

        Plane obj = new Boeing(777,"Delta");
        obj.willDrive();
        obj.willFly();
        obj.willTurnOn();

        FlightStatus green = new FlightStatus(airport.getName(), airport.getLocation(),"On Time");
        FlightStatus yellow = new FlightStatus(airport.getName(), airport.getLocation(), "Delayed");
        FlightStatus red = new FlightStatus(airport.getName(), airport.getLocation(), "Cancelled");

        Ticket price1 = new Ticket(airport.getName(), airport.getLocation(), "146.69");
        Ticket price2 = new Ticket(airport.getName(), airport.getLocation(), "199.99");
        Ticket price3 = new Ticket(airport.getName(), airport.getLocation(), "207.80");
        Ticket price4 = new Ticket(airport.getName(), airport.getLocation(), "301.80");

        Runway runwaynumber1 = new Runway(airport.getName(), airport.getLocation(), ": Alpha ");
        Runway runwaynumber2 = new Runway(airport.getName(), airport.getLocation(), ": Beta ");
        Runway runwaynumber3 = new Runway(airport.getName(), airport.getLocation(), ": Charlie ");


        System.out.println("Airport:" + airport.getName()+ " | Location: " + airport.getLocation());
        System.out.println("Administration: " + employee1.getGeneralEmployee() +"," + " Janitor " +"," + airport.getName());
        System.out.println("Administration: " + employee2.getGeneralEmployee() +"," + " Supervisor " +","+ airport.getName());
        System.out.println("                 ");

        System.out.println("Passengers");
        System.out.println(passenger1.getPassengerName() + ": Seat Number " + passenger1.getSeatNumber());
        System.out.println(passenger2.getPassengerName() + ": Seat Number " + passenger2.getSeatNumber());
        System.out.println(         );

        System.out.println("Pilots");
        System.out.println(pilot1.getPilotName() +", " + pilot1.getEmployeeType()+", Runway" + runwaynumber1.getRunwayID());
        System.out.println(pilot3.getPilotName() +", " + pilot3.getEmployeeType()+", Runway" + runwaynumber1.getRunwayID());
        System.out.println(pilot2.getPilotName() +", " + pilot2.getEmployeeType()+", Runway" + runwaynumber3.getRunwayID());
        System.out.println(       );


        System.out.println("Flight Status:");
        System.out.println(green.getFlightStanding() +"-" + " Flight " +  green.a );
        System.out.println(yellow.getFlightStanding() +"-" + " Flight " + yellow.b);
        System.out.println(red.getFlightStanding() +"-" + " Flight " + red.c);
        System.out.println(       );

        System.out.println("Alaskan Airways " + "$" + price1.cost);
        System.out.println("Delta " + "$" + price2.cost);
        System.out.println("Spirit " + "$" + price3.cost);
        System.out.println("Jetblue " + "$" + price4.cost);
        System.out.println(       );

        System.out.println(airport.toString());
        System.out.println(passenger1.toString());
        System.out.println(passenger2.toString());






    }




}
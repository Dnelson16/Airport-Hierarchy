public class FlightStatus extends Flight{
    protected String flightStanding;
    public FlightStatus( String name, String location,String flightStanding){
        super(name,location);
        this.flightStanding = flightStanding;
    }

    public String getFlightStanding() {

        return flightStanding;
    }

    public void setFlightStanding(String flightStanding) {

        this.flightStanding = flightStanding;
    }
}

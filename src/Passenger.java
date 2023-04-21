public class Passenger extends Airport{
    private int seatNumber;
    private String passengerName;
    public Passenger(String name, String location, int seatNumber, String passengerName){
        super(name, location);
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;

    }

    @Override
    public String toString() {
        return seatNumber + " " + passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

}

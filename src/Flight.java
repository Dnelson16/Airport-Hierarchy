public class Flight extends Airport{
    private int flightNumber;
    public int a = 300;
    public int b = 301;
    public int c = 302;
    private String airlines;
    public Flight(String name, String location){
        super(name, location);
        this.flightNumber = flightNumber;
        this.airlines = airlines;

    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

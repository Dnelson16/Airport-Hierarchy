public class Airport {
    protected String name;
    protected String location;

    public void println() {
        System.out.println("Dylan Nelson International");


    }

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

    public void turnOn() {
    }

    public void fly() {
    }

    public void drive() {
    }
}

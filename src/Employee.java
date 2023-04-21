public class Employee extends Airport {
    public String generalEmployee;

    public Employee (String name, String location,String generalEmployee) {
        super(name, location);
        this.generalEmployee = generalEmployee;
    }public Employee(String name, String location) {
        super(name, location);
    }

    public String getGeneralEmployee() {
        return generalEmployee;
    }

    public void setGeneralEmployee(String generalEmployee) {
        this.generalEmployee = generalEmployee;
    }
}

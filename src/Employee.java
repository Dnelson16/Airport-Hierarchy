public class Employee extends AirportManagment {
    private String generalEmployee;

    public Employee (String name, String location,String generalEmployee) {
        super(name, location);
        this.generalEmployee = generalEmployee;
    }

    public String getGeneralEmployee() {
        return generalEmployee;
    }

    public void setGeneralEmployee(String generalEmployee) {
        this.generalEmployee = generalEmployee;
    }
}

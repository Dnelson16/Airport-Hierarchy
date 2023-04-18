public class AirportManagment extends Airport{
    private String employeeType;
    public AirportManagment(String name, String location){
        super(name, location);
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}

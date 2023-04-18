public class Pilot extends Employee {
    private String pilotName;
    private String employeeType;
    public Pilot(String name, String location, String pilotName, String employeeType ){
        super(name,location, location);
        this.pilotName = pilotName;
        this.employeeType = employeeType;

    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    @Override
    public String getEmployeeType() {
        return employeeType;
    }

    @Override
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}

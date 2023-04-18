public class RunwayName extends Airport{
    private String runwayID;
    public RunwayName(String name, String location,String runwayID){
        super(name, location);
        this.runwayID = runwayID;
    }

    public String getRunwayID() {
        return runwayID;
    }

    public void setRunwayID(String runwayID) {
        this.runwayID = runwayID;
    }
}

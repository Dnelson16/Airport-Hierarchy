public class Runway extends Airport{
    protected String runwayID;

    public Runway(String name, String location, String runwayID){
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

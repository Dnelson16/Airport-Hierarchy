public class TicketPrice extends Flight{
    public int cost;

    public TicketPrice(String name, String location){
        super(name, location);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

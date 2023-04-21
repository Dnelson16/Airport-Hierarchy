public class Ticket extends Flight{
    public static void main(String[] args) {
        int cost;
        double price1 = 146.69;
        double price2 = 199.99;
        double price3 = 207.80;
        double price4 = 301.80;
    }

    public String cost;
    public Ticket(String name, String location, String cost){
        super(name, location);
        this.cost = cost;

    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}

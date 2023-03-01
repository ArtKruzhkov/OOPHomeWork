package HomeWork03.Task1;

public class Bus extends Autotransport {
    private String model;
    protected double ticketprice;
    private int routenum;
    
 

    public Bus(String color, int year, double power, int doors, int wheels, String gosNumber, String model, double ticketprice, int routenum) {
        super(color, year, power, doors, wheels, gosNumber);
        this.model = model;
        this.ticketprice = ticketprice;
        this.routenum = routenum;
    }

    public Bus() {
        super();
        this.model = "ModelA1";
        this.ticketprice = 50.5;
        this.routenum = 1;
    }

    public String getModel() {
        return this.model;
    }

    public int getRouteNum() {
        return this.routenum;
    }

    public void setRouteNum(int routenum) {
        this.routenum = routenum;
    }

    public void onRoute() {
        if(state == State.On) {
            System.out.printf("\nАвтобус с госномером %s выехал на маршрут %d\n", super.gosNumber, this.routenum);
        } else {
            System.out.println("\nАвтобус не заведен\n");
        }
    }


    
    @Override
    public String toString() {
        return String.format("%s Model: %s. RouteNum: %d. TicketPrice: %.2f", super.toString(), this.model, this.routenum, this.ticketprice);
    }
}

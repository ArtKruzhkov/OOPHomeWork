package HomeWork03.Task1;

public class Program {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        System.out.println(bus1);
        bus1.setDoors(6);
        bus1.setColor("green");
        bus1.setPower(6.5);
        bus1.setRouteNum(42);
        bus1.ticketprice = 55;
        System.out.println(bus1);
        bus1.powerOn();
        bus1.onRoute();

        Bus bus2 = new Bus("blue", 2011, 5.5, 4, 4, "B636TX77", "Model2B", 50.5, 267);
        System.out.println(bus2);
        System.out.println(bus2.getRouteNum());

        Car car1 = new Car();
        System.out.println(car1);
        car1.setColor("black");
        car1.setPower(3.5);
        car1.setGosNum("H657KA777");
        car1.setOwner("Tom");
        System.out.println(car1);
    }
}

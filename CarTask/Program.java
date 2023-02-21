package CarTask;

public class Program {
    public static void main(String[] args) {
        Car vehicle1 = new Car("Audi", 2010, 2000000, "black", 2.5);
        System.out.println(vehicle1.getInfo());

        Car vehicle2 = new Car("Toyota", 2005, 1200000, "white", 2.0);
        System.out.println(vehicle2.getInfo());

        vehicle1.powerOn();
        vehicle2.powerOn();
        vehicle1.raceVS(vehicle2);

    }
}
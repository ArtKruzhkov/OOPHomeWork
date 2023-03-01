package HomeWork03.Task1;

public class Car extends Autotransport{
    private String carmodel;
    private String owner;

    public Car(String color, int year, double power, int doors, int wheels, String gosNumber, String carmodel, String owner) {
        super(color, year, power, doors, wheels, gosNumber);
        this.carmodel = carmodel;
        this.owner = owner;
    }

    public Car() {
        super();
        this.carmodel = "toyota";
        this.owner = "DefOwner";
    }

    public String getCarmodel() {
        return this.carmodel;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("%s CarModel: %s. Owner: %s", super.toString(), this.carmodel, this.owner);
    }
    
}

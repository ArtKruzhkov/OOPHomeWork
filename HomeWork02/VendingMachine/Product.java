package HomeWork02.VendingMachine;

public class Product {
    public String name;
    public double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Product() {
        this.name = "Sprite_0.5";
        this.cost = 90.5;
    }
    
    public String getProductbyName() {
        return this.name;
    }


    public double getProductbyCost() {
        return this.cost;
    }
}

package HomeWork02.VendingMachine;

public class Program {
    public static void main(String[] args) {
        VendingMachine wendy = new VendingMachine(4);
        wendy.add(new Product("Sprite", 90.5));
        wendy.add(new Product("Cola", 89.99));
        wendy.add(new Product("Fanta", 90.95));
        wendy.add(new Product("Tonick", 70.95));
        wendy.getProdbyName("Cola");
        wendy.getProdbyName("Gin");
        wendy.getProdbyName("Pivo");
        wendy.getProdbyName("Sprite");
        wendy.getProdbycost(90.5);
        wendy.getProdbycost(101.1);
        wendy.getProdbycost(89.99);
        wendy.getProdbycost(200);
    }
}

package HomeWork02.VendingMachine;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public List<Product> list = new ArrayList<>();

    public int max;

    public VendingMachine(int max, List<Product> list) {
        this.max = max;
        this.list = list;
    }

    public VendingMachine(int max) {
        super();
        this.max = max;
    }


    

    public void add(Product product) {
        list.add(product);
    }



    public void getProdbyName(String name) {
        int count = 0;
        for(Product product: list) {
            if(product.getProductbyName() == name) {
                // System.out.printf("\nПродукт с таким именем %s есть в наличии", name);
                count = count + 1;
            } 
        }
        if(count >= 1) {
            System.out.printf("\nПродукт с таким именем %s есть в наличии", name);
        } else {
            System.out.printf("\nПродукт с таким именем %s не найден", name);
        }
     }



    public void getProdbycost(double cost) {
        int count = 0;
        for(Product product: list) {
            if(product.getProductbyCost() == cost) {
                System.out.printf("\nПродукт по такой цене %.2f есть в наличии это %s", cost, product.getProductbyName());
                count = count + 1;
            } 
        }
        if(count == 0) {
            System.out.printf("\nПродукт по такой цене %.2f не найден", cost);
        }
     }

}

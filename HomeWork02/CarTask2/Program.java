package HomeWork02.CarTask2;

public class Program {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Kia", 2018, 800000, "white", 1.5);
        System.out.println(car1.getInfo());
        
        System.out.println("---------------------------------------------");
        System.out.printf("Модель автомобиля: %s", car1.getModel());
        System.out.printf("\nГод выпуска автомобиля: %d", car1.getYear());
        car1.price = 1100000;     // меняем цену так как она с public доступом
        System.out.printf("\nЦена автомобиля: %.2f", car1.getPrice());
        System.out.printf("\nЦвет автомобиля: %s", car1.getColor());
        System.out.printf("\nМощность автомобиля: %.2f", car1.getPower());

        
        car1.setModel("Nissan");
        car1.setColor("yellow");
        car1.setPower(2.5);
        car1.setYear(2017);

        System.out.println("\nНовые характеристики автомобиля");
        System.out.printf("Модель автомобиля: %s", car1.getModel());
        System.out.printf("\nГод выпуска автомобиля: %d", car1.getYear());
        System.out.printf("\nЦвет автомобиля: %s", car1.getColor());
        System.out.printf("\nМощность автомобиля: %.2f", car1.getPower());

        car1.compareYear(car2);

    }
}

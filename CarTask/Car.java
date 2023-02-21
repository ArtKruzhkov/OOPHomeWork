package CarTask;

import java.util.Random;

public class Car {
    
    enum State {
        On, Off
    }

    public String model;
    public int year;
    public double price;
    public String color;
    public double power;
    public State state;

    public Car(String model, int year, double price, String color, double power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.state = State.Off;
    }

    public String getInfo() {
        return String.format("\nМодель машины: %s; Год: выпуска %d; Цена: %.2f; Цвет: %s; Мощность: %.2f.", 
        model, year, price, color, power);
    }

 

    public void powerOn() {
        if(this.state == State.Off) {
            this.state = State.On;
            System.out.printf("\nАвтомобиль %s заведен.\n", model);
        } else {
            System.out.printf("\nАвтомобиль %s УЖЕ заведен. Невозможно завести.\n", model);
        }
    }

    public void powerOff() {
        if(this.state == State.On) {
            this.state = State.Off;
            System.out.printf("\nАвтомобиль %s заглушен.\n", model);
        } else {
            System.out.printf("\nАвто %s не заведен!!! Невозможно заглушить.\n", model);
        }
    }

    public void goRoad(String dist) {
        if(this.state == State.On) {
            System.out.printf("\nНаправляемся в %s на автомобиле %s.\n", dist, model);
        } else {
            System.out.printf("\nАвтомобиль %s не заведен. Заведите автомобиль чтобы начать движение.\n", model);
        }
    }

    public void raceVS(Car enemy) {
        if(this.state == State.On & enemy.state == State.On) {
            int distance = 1000;
            int laps = 5;
            double time1 = 0;
            double time2 = 0;
            for (int i = 0; i < laps; i++) {
                Random r = new Random();
                int speed1 = r.nextInt(50, 80);
                int speed2 = r.nextInt(50, 80);
                time1 = time1 + distance / laps / speed1;
                time2 = time2 + distance / laps / speed2;
                System.out.printf("\nВремя автомобилей после %d круга:\n", i+1);
                System.out.println(time1);
                System.out.println(time2);
            } if(time1 < time2) {
                System.out.printf("\nВ гонке победил автомобиль %s.", this.model);
            } else if (time2 < time1) {
                System.out.printf("\nВ гонке победил автомобиль соперника %s.", enemy.model);
            } else {
                System.out.println("\nАвтомобили финишировали одновременно!");
            }
        } else if(this.state == State.On & enemy.state == State.Off) {
            System.out.printf("\nАвтомобиль %s вашего соперника не заведен!", enemy.model);
        } else {
            System.out.printf("\nАвтомобиль %s не заведен. Заведите автомобиль чтобы учавствовать в гонке.\n", this.model);
        }
    }
}
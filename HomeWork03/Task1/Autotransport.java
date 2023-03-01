package HomeWork03.Task1;

public class Autotransport extends Transport {
    enum State {
        On, Off
    }
    protected int doors;
    protected int wheels;
    protected String gosNumber;
    protected State state = State.Off;

    

    public Autotransport(String color, int year, double power, int doors, int wheels, String gosNumber) {
        super(color, year, power);
        this.doors = doors;
        this.wheels = wheels;
        this.gosNumber = gosNumber;
        this.state = State.Off;
    }

    public Autotransport() {
        super();
        this.doors = 4;
        this.wheels = 4;
        this.gosNumber = "A111AA99";
        this.state = State.Off;
    }
    
    public int getDoors() {
        return this.doors;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setGosNum(String gosnum) {
        this.gosNumber = gosnum;
    }

    public void powerOn() {
        if(this.state == State.Off) {
            this.state = State.On;
            System.out.printf("\nАвтомобиль с госномером %s заведен.", gosNumber);
        } else {
            System.out.printf("\nАвтомобиль с госномером %s УЖЕ заведен. Невозможно завести.", gosNumber);
        }
    }

    public void powerOff() {
        if(this.state == State.On) {
            this.state = State.Off;
            System.out.printf("\nАвтомобиль с госномером %s заглушен.", gosNumber);
        } else {
            System.out.printf("\nАвто с госномером %s не заведен!!! Невозможно заглушить.", gosNumber);
        }
    }

    @Override
    public String toString() {
        return String.format("%s Doors: %d. Wheels: %d. GosNumber: %s", super.toString(), this.doors, this.wheels, this.gosNumber);
    }
}

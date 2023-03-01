package HomeWork03.Task1;

public class Transport {
    private String color;
    private int year;
    protected double power;
    
    public Transport(String color, int year, double power) {
        this.color = color;
        this.year = year;
        this.power = power;
    }

    public Transport() {
        this.color = "white";
        this.year = 2010;
        this.power = 2.0;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return String.format("Color: %s. Year: %d. Power: %.2f", this.color, this.year, this.power);
    }
}
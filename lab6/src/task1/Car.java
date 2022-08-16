package task1;

public class Car {
    public enum Type{
        FORD,
        JEEP,
        TESLA
    }
    private int price;
    private int year;
    private Type type;

    public Car(int price, int year, Type type) {
        this.price = price;
        this.year = year;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public Type getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", type=" + type +
                '}';
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("R35 Skyline GT-R", "NISSAN", 2007, 110000.0, "Blue", 25);

        System.out.println(car1.toString());

        car1.sell(13);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.setColor("Purple");
        car1.setPrice(115000.0);

        System.out.println(car1.toString());
    }
}
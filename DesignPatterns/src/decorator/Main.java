package decorator;

public class Main {
    public static void main(String[] args) {


        CarInterface car = new SimpleCar();
        CarInterface luxuryCar = new SimpleCar();
        CarInterface sportsCar = new SimpleCar();

        luxuryCar = new LuxuryCar(luxuryCar);
        sportsCar = new SportsCar(sportsCar);

        car.drive();
        luxuryCar.drive();
        sportsCar.drive();
    }
}

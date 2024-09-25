package decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(CarInterface car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Ma è sportiva");
    }
}

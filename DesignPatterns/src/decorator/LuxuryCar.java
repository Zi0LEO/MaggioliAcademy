package decorator;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(CarInterface car) {
        super(car);
    }

    public void drive(){
        super.drive();
        System.out.println("Ma è di lusso");
    }
}

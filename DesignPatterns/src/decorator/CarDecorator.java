package decorator;

public abstract class CarDecorator implements CarInterface{

    CarInterface car;

    public CarDecorator(CarInterface car){
        this.car  = car;
    }

    public  void drive(){
        car.drive();
    }
}

package factoryMethod;

public class GroundLogistics implements Logistics{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

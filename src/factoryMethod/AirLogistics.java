package factoryMethod;

public class AirLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Plane();
    }
}

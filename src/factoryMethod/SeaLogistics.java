package factoryMethod;

public class SeaLogistics implements Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

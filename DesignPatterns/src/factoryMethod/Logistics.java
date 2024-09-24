package factoryMethod;

public interface Logistics {
    default void planDelivery(){
        Transport t = createTransport();
        t.deliver();
    }

    Transport createTransport();
}

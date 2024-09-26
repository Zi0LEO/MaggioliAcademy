package strategy;

public class StandardDelivery implements DeliveryStrategy{


    @Override
    public int deliveryCost(String start, String arrive) {
        // calcola distanza
        return (int) Math.floor(Math.random() * 100);
    }
}

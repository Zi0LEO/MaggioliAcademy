package strategy;

public class ExpressDelivery implements DeliveryStrategy{
    @Override
    public int deliveryCost(String start, String end) {
        return (int) Math.floor(Math.random() * 100 * 1.5);
    }
}

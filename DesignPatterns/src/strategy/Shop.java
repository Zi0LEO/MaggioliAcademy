package strategy;

import jdk.jshell.Snippet;

public class Shop {
    private DeliveryStrategy strategy;

    public void calculateCost(String start, String arrive){
        System.out.format("Il costo della spedizione è: %s", strategy.deliveryCost(start,arrive));
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }
}

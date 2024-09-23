package factoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = null;
        Scanner sc = new Scanner(System.in);

        while(logistics == null) {
            System.out.println("Selezionare metodo di spedizione");
            System.out.println("1 - Terra, 2 - Mare, 3 - Aria");
            String in = sc.nextLine();
            switch (in){
                case "1": logistics = new GroundLogistics();
                break;
                case "2": logistics = new SeaLogistics();
                break;
                case "3": logistics = new AirLogistics();
                break;
                default:
                    System.out.println("Selezione non valida, riprovare");
            }
        }
        logistics.planDelivery();
    }
}
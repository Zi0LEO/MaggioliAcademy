package abstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UIFactory factory = null;
        Scanner sc = new Scanner(System.in);

        while(factory == null) {
            System.out.println("Selezionare OS");
            System.out.println("1 - Windows, 2 - Mac");
            String in = sc.nextLine();
            switch (in){
                case "1": factory = new WindowsUIFactory();
                    break;
                case "2": factory = new MacUIFactory();
                    break;
                default:
                    System.out.println("Selezione non valida, riprovare");
            }
        }
        factory.render();

    }
}

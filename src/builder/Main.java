package builder;

import java.util.Scanner;

public class Main {
    static OrdineBuilderIF ordineBuilder =  new OrdineBuilder();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ordineBuilder.reset();

        boolean stillGoing = true;

        Ordine ordine;

        while(stillGoing){
            System.out.println("Cosa vuoi fare?");
            System.out.println("1 - Aggiungi prodotto, 2 - Aggiungi destinazione, 3 - Aggiungi metodo di pagamento, 4 Seleziona tipologia cliente, 5 - Esci");
            String input = sc.nextLine();
            switch (input){
                case "1":
                    aggiungiProdotto();
                    break;
                case "2":
                    aggiungiDestinazione();
                    break;
                case "3":
                    aggiungiPagamento();
                    break;
                case "4":
                    selezionaCliente();
                    break;
                case "5":
                    stillGoing = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }

        ordine = ordineBuilder.build();

    }

    private static void aggiungiProdotto(){
        System.out.println("Digita nome prodotto");
        ordineBuilder.aggiungiProdotto(sc.nextLine());
    }

    private static void aggiungiDestinazione(){
        System.out.println("Digita destinazione");
        ordineBuilder.impostaSpedizione(sc.nextLine());
    }

    private static void aggiungiPagamento(){
        System.out.println("Digita nome metodo di pagamento");
        ordineBuilder.scegliPagamento(sc.nextLine());
    }

    private static void selezionaCliente(){
        System.out.println("Sei un cliente vip? (y/n)");
        String input = sc.nextLine();
        switch (input) {
            case "y":
                ordineBuilder.aggiungiSconto(20);
                System.out.println("Applicato sconto del 20%");
                break;
            default:
                System.out.println("Nessuno sconto applicato");
        }
    }
}

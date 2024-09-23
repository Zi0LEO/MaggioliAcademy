package builder;

import java.util.LinkedList;

public class Ordine {
    LinkedList<String> prodotti;
    int sconto;
    String destinazione;
    String metodoPagamento;

    public Ordine(){
        prodotti = new LinkedList<>();
        sconto = 0;
        destinazione = "";
        metodoPagamento = "";
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void setProdotti(String prodotto) {
        prodotti.add(prodotto);
    }

    public void setSconto(int sconto) {
        this.sconto = sconto;
    }

    public int getSconto() {
        return sconto;
    }

    public LinkedList<String> getProdotti() {
        return prodotti;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public String getMetodoPagamento() {
            return metodoPagamento;
    }
}

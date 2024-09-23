package builder;

public class OrdineBuilder implements OrdineBuilderIF{

    Ordine ordine;

    public void reset(){
        ordine = new Ordine();
    }

    @Override
    public void aggiungiProdotto(String prodotto) {
        ordine.setProdotti(prodotto);

    }

    @Override
    public void aggiungiSconto(int sconto) {
        ordine.setSconto(sconto);

    }

    @Override
    public void impostaSpedizione(String destinazione) {
        ordine.setDestinazione(destinazione);

    }

    @Override
    public void scegliPagamento(String metodo) {
        ordine.setMetodoPagamento(metodo);

    }

    @Override
    public Ordine build() {
        return ordine;
    }
}

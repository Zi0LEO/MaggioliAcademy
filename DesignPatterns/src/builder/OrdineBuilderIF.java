package builder;

public interface OrdineBuilderIF {

    void reset();

    void aggiungiProdotto(String prodotto);

    void aggiungiSconto(int sconto);

    void impostaSpedizione(String destinazione);

    void scegliPagamento(String metodo);

    Ordine build();
}

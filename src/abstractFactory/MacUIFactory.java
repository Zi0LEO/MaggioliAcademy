package abstractFactory;

public class MacUIFactory implements UIFactory{

    @Override
    public Pulsante creaPulsante() {
        return new PulsanteMac();
    }

    @Override
    public Finestra creaFinestra() {
        return new FinestraMac();
    }

    @Override
    public Menu creaMenu() {
        return new MenuMac();
    }
}
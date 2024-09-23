package abstractFactory;

public class WindowsUIFactory implements UIFactory{

    @Override
    public Pulsante creaPulsante() {
        return new PulsanteWindows();
    }

    @Override
    public Finestra creaFinestra() {
        return new FinestraWindows();
    }

    @Override
    public Menu creaMenu() {
        return new MenuWindows();
    }
}

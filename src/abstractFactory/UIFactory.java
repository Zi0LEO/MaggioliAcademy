package abstractFactory;

public interface UIFactory {

    default void render() {
        creaFinestra();
        creaPulsante();
        creaMenu();
    }

    Pulsante creaPulsante();

    Finestra creaFinestra();

    Menu creaMenu();
}

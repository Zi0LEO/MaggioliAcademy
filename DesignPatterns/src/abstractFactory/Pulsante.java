package abstractFactory;

public abstract class Pulsante {

    protected void announce(String os){
        System.out.println("Creato pulsante per " + os);
    }
}

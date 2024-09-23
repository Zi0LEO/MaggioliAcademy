package abstractFactory;

public abstract class Menu {

    protected void announce(String os){
        System.out.println("Creato menu per " + os);
    }
}

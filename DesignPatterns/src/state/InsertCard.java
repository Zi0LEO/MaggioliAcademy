package state;

public class InsertCard extends AbstractState{

    @Override
    public void printState() {
        System.out.println("Inserire carta");

        bancomat.changeState(new InsertPin());
    }
}

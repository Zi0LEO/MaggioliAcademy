package state;

public class Bancomat {

    private State state;

    public Bancomat(State state){
        this.state = state;
        state.setBancomat(this);
    }

    public void sayWhatToDo(){
        state.printState();
    }

    public void changeState(State state){
        this.state = state;
        state.setBancomat(this);
    }


    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(new InsertCard());

        bancomat.sayWhatToDo();
        bancomat.sayWhatToDo();
        bancomat.sayWhatToDo();

    }
}

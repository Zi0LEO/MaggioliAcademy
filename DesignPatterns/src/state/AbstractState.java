package state;

public abstract class AbstractState implements State{

    Bancomat bancomat;

    @Override
    public void setBancomat(Bancomat bancomat) {
        this.bancomat = bancomat;
    }
}

package state;

public class InsertPin extends AbstractState{

    @Override
    public void printState() {
        System.out.println("Inserire PIN");

        bancomat.changeState(new WithdrawMoney());
    }
}

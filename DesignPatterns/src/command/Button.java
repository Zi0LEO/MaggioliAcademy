package command;

public class Button {

    private Command command;

    public void setCommand(Command c){
        command = c;
    }

    public void execute(){
        command.execute();
    }

    public void undo(){
        command.undo();
    }
}

package chainOfResponsability;

public class Request {

    int level;

    public Request(int level){
        this.level = level;
    }

    public boolean canBeHandled(int levelOfHandler){
        return (level == levelOfHandler);
    }
}

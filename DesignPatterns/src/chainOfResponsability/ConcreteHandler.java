package chainOfResponsability;

public class ConcreteHandler extends BaseHandler{

    int LEVEL;

    public ConcreteHandler(int i){
        LEVEL = i;
    }

    public void handle(Request request){
        if(request.canBeHandled(LEVEL))
            System.out.format("Request of level %s handled \n", LEVEL);
        else
            super.handle(request);
    }
}

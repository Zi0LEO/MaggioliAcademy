package chainOfResponsability;

import java.util.Random;

public abstract class BaseHandler implements Handler{

    Handler next;

    public void setNext(Handler handler){
        next = handler;
    }

    public void handle(Request request){
        if(next != null)
            next.handle(request);
    }


    public static void main(String[] args) {
        final int MAX = 4;
        final int MIN = 1;

        Handler h1 = new ConcreteHandler(1);
        Handler h2 = new ConcreteHandler(2);
        Handler h3 = new ConcreteHandler(3);
        h1.setNext(h2);
        h2.setNext(h3);

        Random random = new Random();

        for(int i = 0; i < 20; i++){
            int randomNumber = random.nextInt(MAX - MIN) + MIN;
            Request r = new Request(randomNumber);

            h1.handle(r);
        }
    }
}

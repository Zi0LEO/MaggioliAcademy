package mediator;

public class User {

    private final Mediator mediator;
    private final String name;

    public User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }

    public void sendMessage(String message){
        mediator.notify(this, message);
    }

    public void receiveMessage(User sender, String message){
        System.out.println();
        System.out.println(this.name);
        System.out.format("Ricevuto messaggio da parte di %s: \n", sender.getName());
        System.out.println(message + "\n");
    }
}

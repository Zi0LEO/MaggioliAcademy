package mediator;

import java.util.ArrayList;

public class ChatRoom implements Mediator{

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void notify(User sender, String message) {
        for(User user: users){
            user.receiveMessage(sender, message);
        }
    }

    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> getUsers(){
        return users;
    }
}

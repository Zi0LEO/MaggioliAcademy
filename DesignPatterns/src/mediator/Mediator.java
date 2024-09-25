package mediator;

import java.util.ArrayList;

public interface Mediator {

    void notify(User sender, String message);

    void addUser(User user);

    ArrayList<User> getUsers();
}

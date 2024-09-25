package mediator;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ChatRoom();
        User user0 = new User("Mario", mediator);
        mediator.addUser(user0);
        User user1 = new User("Luigi", mediator);
        mediator.addUser(user1);
        User user2 = new User("Antonio", mediator);
        mediator.addUser(user2);
        User user3 = new User("Marco", mediator);
        mediator.addUser(user3);
        User user4 = new User("Leo", mediator);
        mediator.addUser(user4);
        User user5 = new User("Giuseppe", mediator);
        mediator.addUser(user5);
        User user6 = new User("Francesco", mediator);
        mediator.addUser(user6);
        User user7 = new User("Paolo", mediator);
        mediator.addUser(user7);
        User user8 = new User("Andrea", mediator);
        mediator.addUser(user8);
        User user9 = new User("Mauro", mediator);
        mediator.addUser(user9);


        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            User user = mediator.getUsers().get(random.nextInt(0, 10));
            user.sendMessage("Ciao da " + user.getName());
        }
    }
}

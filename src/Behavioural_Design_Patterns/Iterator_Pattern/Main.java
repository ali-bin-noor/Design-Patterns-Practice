package Behavioural_Design_Patterns.Iterator_Pattern;

public class Main {

    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("durgesh","14"));
        userManagement.addUser(new User("harsh","23"));
        userManagement.addUser(new User("ankit","54"));
        userManagement.addUser(new User("gautam","12"));

        var iterator = userManagement.getIterator();
        while(iterator.hasNext()){
            User user = (User) iterator.next();
            System.out.println(user.getName());
        }

    }
}

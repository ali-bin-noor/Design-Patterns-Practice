package Creational_Design_Patterns.Builder_Pattern;

public class UserTest {

    public static void main(String[] args) {
        var user1 = new User.UserBuilder("Maheboob", "Pune", "8484079010").
                //setMarried("Yes").
                //setChild("No").
                 build();
        System.out.println(user1);

        var user2 = User.UserBuilder.builder().
                setMarried("Yes").
                setChild("No").
                build();
        System.out.println(user2);
    }
}

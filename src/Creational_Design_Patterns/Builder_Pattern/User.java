package Creational_Design_Patterns.Builder_Pattern;

public class User {

    //required
    private String name;
    private String address;
    private String cell;

    //optional
    private String married;
    private String child;

    private User(UserBuilder userBuilder){
        this.name=userBuilder.name;
        this.address=userBuilder.address;
        this.cell=userBuilder.cell;
        this.married=userBuilder.married;
        this.child=userBuilder.child;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCell() {
        return cell;
    }

    public static class UserBuilder{
        //required
        private String name;
        private String address;
        private String cell;

        //optional
        private String married;
        private String child;

        public UserBuilder(String name, String address, String cell) {
            this.name = name;
            this.address = address;
            this.cell = cell;
        }

        public UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setName(String name){
            this.name=name;
            return this;
        }

        public UserBuilder setAddress(String address){
            this.address=address;
            return this;
        }

        public UserBuilder setCell(String cell){
            this.cell=cell;
            return this;
        }

        public UserBuilder setMarried(String married){
            this.married=married;
            return this;
        }

        public UserBuilder setChild(String child){
            this.child=child;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public String toString(){
        return "Name : "+name +" Address : "+address+" cell : "+cell+ " Married : "+married+" Child : "+child;
    }
}

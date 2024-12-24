package Creational_Design_Patterns.Singleton_Pattern;

import java.io.*;

public class Singleton implements Serializable, Cloneable  {

    //Lazy way of creating singleton object
    private static volatile Singleton instance;

    private Singleton(){

        //handling reflection attacks
        if(instance!=null){
            throw new RuntimeException("You are trying to break singleton class!");
        }

    }

    public static Singleton getInstance() {
        //object of this class
        if (instance == null) {
          synchronized(Singleton.class){
              if(instance==null){
                  instance = new Singleton();
              }
          }
        }
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }
}

final class Jalebi{
    //Eager way of creating the singleton object
    private static Jalebi jalebi = new Jalebi();

    private Jalebi(){

    }

    public static Jalebi getJalebi(){
        return jalebi;
    }


}

class TestSingleTon {

    public static void main(String[] args) throws Exception,CloneNotSupportedException {
        var  instance1 = Singleton.getInstance();
        var  instance2 = Singleton.getInstance();
        System.out.println("First instance for Singleton is  : "+instance1);
        System.out.println("Second instance for Singleton is  : "+instance2);
        var  jalebi1 = Jalebi.getJalebi();
        var  jalebi2 = Jalebi.getJalebi();
        var  jalebi3 = Jalebi.getJalebi();
        System.out.println("First instance for Jalebi is  : "+jalebi1);
        System.out.println("Second instance for Jalebi is  : "+ jalebi2);
        System.out.println("Third instance for Jalebi is  : "+jalebi3);
        //-----------------------------------------------------------------//
        System.out.println("-----------------------------------------------------------------");

        /*
        * how we can break singleton pattern ?
        * 1.Reflection API to break singleton pattern
        * solution: 1) If object is there ==> throw exception
        *           2) Use enum as below
        *
        * 2.Using Deserialization
        * solution : implementing readResolve method
        *
        * 3.cloning
        * */

        //Using enum
        Samosa samosa = Samosa.INSTANCE;
        System.out.println(samosa);
        Samosa.test();
        //Using Reflection API
        var constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        var singleton = constructor.newInstance();
        System.out.print(singleton);

        System.out.println("-----------------------------------------------------------------");

        //Using Deserializable
        Singleton singleton1 =Singleton.getInstance();
        System.out.println(singleton1);
        //Serialize the Singleton instance
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.json"));
        oos.writeObject(singleton1);

        //De-Serialize the Singleton instance
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.json"));
        Singleton singleton2 = (Singleton) ois.readObject();
        System.out.println(singleton2);

        //Using clone
        Singleton clone = (Singleton)singleton1.clone();
        System.out.println(clone);


    }


    public enum Samosa{
        INSTANCE;

        //we can access the method inside enum
        public static void test(){
            System.out.println("This is test method from enum.");
        }
    }

}

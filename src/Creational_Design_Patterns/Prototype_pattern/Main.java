package Creational_Design_Patterns.Prototype_pattern;

public class Main {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        var networkConnection = new NetworkConnection();
        networkConnection.setIpAddress("194.168.1.1");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);
        networkConnection.getDomains().remove(0);

        var networkConnection2= networkConnection.clone();
        var networkConnection3= networkConnection.clone();
        System.out.println(networkConnection);
        System.out.println(networkConnection2);
        System.out.println(networkConnection3);
    }
}

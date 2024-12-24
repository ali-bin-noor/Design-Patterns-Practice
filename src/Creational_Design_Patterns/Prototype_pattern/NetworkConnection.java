package Creational_Design_Patterns.Prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ipAddress;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ipAddress='" + ipAddress + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public String getImportantData() {
        return importantData;
    }


    public void loadImportantData() throws InterruptedException {
        this.importantData = "very very important data.";
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.instagram.com");
        domains.add("www.linkedin.com");
        Thread.sleep(5000);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //coding for deep copying (deepl cloning)
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress(this.ipAddress);
        networkConnection.setImportantData(this.importantData);
        networkConnection.setDomains(domains);

        //this.domains.forEach(domain->networkConnection.setDomains(getDomains()));

        /*for(String domain : domains){
            networkConnection.getDomains().add(domain);
        }*/

        return networkConnection;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Five;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhnnum() {
        return phoneNumber;
    }

    public String getMail() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person name is:"+this.getName()+" name of the class is:"+ this.getClass().getName();
    }

    
    
    
}

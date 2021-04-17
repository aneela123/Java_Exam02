/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Five;
import java.util.Date;
/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String office, double salary, Date dateHired, 
            String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return "Person name is:"+this.getName()+" name of the class is:"+ this.getClass().getName();
    }
    
    
}

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
public class Student extends Person {
    private double grade;
    private static final String STATUS="Graduate";

    public Student(double grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    

    @Override
   public String toString() {
        return "Person name is:"+this.getName()+" name of the class is:"+ this.getClass().getName();
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;
import java.util.*;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //arraylist creation
        ArrayList <Object> a= new ArrayList<Object>();
        System.out.println("Answer for question 3: Jahna Sri Aneela Ankam");
        Loan l=new Loan(123, "Chris", 0.4);
        Circle c= new Circle(2);
        String s2="luther";
        Date d= new Date();
        a.add(l);
        a.add(c);
        a.add(s2);
        a.add(d);
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i).toString());
        }
    }
    
}

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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date=new Date();
        Person p= new Person("Alexa","Missouri","6605281262","alexa@gmail.com");
        Student s=new Student(4.1,"Ani","Texas","6605281212","ani@gmail.com");
        Employee e=new Employee("Hogwarts",1600,date,"Ron","Newyork","8989","a@gmail.com");
        Staff s1=new Staff("Proffessor","Office", 1000,date,"Ana","Seattle","5656","we@gmail.com");
        Faculty f= new Faculty(1,2,"Colden hall",4545,date,"Alekya","Boston","897856","er@ggmail.com");
        System.out.println("Answer for question 5: Jahna Sri Aneela Ankam");
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(s1);
        System.out.println(f);
    }
    
}

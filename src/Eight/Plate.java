/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Plate extends Utensil{

    public Plate() {
        //does nothing
    }
    @Override
    public String name() {
        return "This is a plate";
    }
    public static void main(String [] args){
        Utensil u=new Plate();
        System.out.println("Answer for question8: Jahna Sri Aneela Ankam");
        System.out.println("This is an abstract method example demonstration"+"\n"+u.name());
    }
}

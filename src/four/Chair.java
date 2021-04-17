/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Chair {
    private int quantity;
    private String color;
    private String showRoomName;

    public Chair(int quantity, String color, String showRoomName) {
        this.quantity = quantity;
        this.color = color;
        this.showRoomName = showRoomName;
    }

    @Override
    public String toString() {
        return  "This is super class"+"\nquantity=" + quantity + 
                ", color=" + color + ", showRoomName=" + showRoomName ;
    }
}

 class PlasticChair extends Chair{
    private double cost;
    private double discount;

    public PlasticChair(double cost, double discount, int quantity, String color, String showRoomName) {
        super(quantity, color, showRoomName);
        this.cost = cost;
        this.discount = discount;
    }
    
    
    @Override
    public String toString() {
        return "This is a Plastic chair sub class" + "\ncost=" + cost + ", discount=" + discount;
    }
 }

class IronChair extends Chair{
    
   
    public IronChair(int quantity, String color, String showRoomName) {
        super(quantity, color, showRoomName);
    }

    @Override
    public String toString() {
        return "This is Iron Chair sub class";
    }
    
    
}
class Driver{
    public static void main(String[] args){
        PlasticChair pc= new PlasticChair(30, 0.4, 2, "black", "TesyaFurniture");
        Chair c= new Chair(3, "red", "IkyaFurniture");
        Chair c1= new IronChair(1, "yellow","LiyaFurniture"); //polymorphic substitution
        System.out.println("Answer for question4: Jahna Sri Aneela Ankam");
        System.out.println(pc);
        System.out.println(c);
    
        System.out.println(c1.toString());
    }
}
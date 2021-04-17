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
public class Socket {
    private double cost;
    private int quantity;
    

    public Socket(double cost, int quantity) {
        this.cost = cost;
        this.quantity = quantity;
        
    }

    @Override
    public String toString() {
        return "This is Socket parent class" + "\ncost=" + cost + ", quantity=" + 
                quantity ;
    }
    
    
}
class ThreePinSocket extends Socket{
    private double power;

    public ThreePinSocket(double power, double cost, int quantity) {
        super(cost, quantity);
        this.power = power;
    }

    @Override
    public String toString() {
        return "ThreePinSocket child class" + "\npower=" + power ;
    }
}

class TwoPinSocket extends ThreePinSocket{

    public TwoPinSocket(double power, double cost, int quantity) {
        super(power, cost, quantity);
    }

    @Override
    public String toString() {
        return "TwoPinSocket childclass" ;
    }
}
class MyDriver{
    public static void main(String[] args){
        Socket s1= new Socket(8, 1);
        Socket s2= new ThreePinSocket(2, 7, 2);
        TwoPinSocket t= new TwoPinSocket(1, 7, 2);
        System.out.println("Answer for question4: Jahna Sri Aneela Ankam ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(t.toString());
    }
}
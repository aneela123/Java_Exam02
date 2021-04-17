/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seven;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public enum SimCards {
    AIRTEL(40,2100,0.2), IDEA(40,1800,0.3), JIO(45,1900,0.8), VADAFONE(40, 1000,0.5);
    
    private double cost;
    private int freq;
    private double firstTimeUser;

    private SimCards(double cost, int freq, double firstTimeUser) {
        this.cost = cost;
        this.freq = freq;
        this.firstTimeUser = firstTimeUser;
    }

    public double getCost() {
        return cost;
    }

    public int getFreq() {
        return freq;
    }

    public double getFirstTimeUser() {
        return firstTimeUser;
    }

    private double priceForFirstTimeUser(){
        return cost-(cost*firstTimeUser/100);
    }
    
    public static void main(String args[]){
        System.out.println("Answer for question 7: Jahna Sri Aneela Ankam");
        System.out.println("Details of sim card:");
        for(SimCards s:SimCards.values()){
            System.out.println(s+" Sim cost is: "+s.getCost()+
                    "The frequency of sim: "+s.getFreq()+
                    " /nPrice after discount is: "+s.priceForFirstTimeUser());
            
        }
    }
}

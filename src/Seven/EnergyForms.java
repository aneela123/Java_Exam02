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
public enum EnergyForms {
    THERMAL,NUCLEAR,RADIANT;
    
    
}
class Driver{
    EnergyForms e;

    public Driver(EnergyForms e) {
        this.e = e;
    }
    
    public void nameOfEnergyForm(){
        switch(e){
            case THERMAL:
                System.out.println("Energy name is: Thermal Energy!");
                break;
            case NUCLEAR:
                System.out.println("Energy Name is: Nuclear Energy!");
                break;
            case RADIANT:
                System.out.println("Energy Name is: Radiant Energy!");
                break;
            default:
                System.out.println("These are some of the examples of different energy forms!");
        }
    }
    public static void main(String[] args){
        Driver d1= new Driver(EnergyForms.THERMAL);
        System.out.println("Answer for question 7: Jahna Sri Aneela Ankam");
        d1.nameOfEnergyForm();
        Driver d2= new Driver(EnergyForms.NUCLEAR);
        d2.nameOfEnergyForm();
        Driver d3= new Driver(EnergyForms.RADIANT);
        d3.nameOfEnergyForm();
    }
} 

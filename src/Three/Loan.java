/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Loan {
    private int loanId;
    private String guaranteer;
    private double interestRate;

    public Loan(int loanId, String guaranteer, double interestRate) {
        this.loanId = loanId;
        this.guaranteer = guaranteer;
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Loan" + "loanId=" + loanId + ", guaranteer=" + 
                guaranteer + ", interestRate=" + interestRate ;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vibudh
 */
public class SavingsAccount {

    /**
     
     */
    public static double annualInterestRate;
    public double savingsBalance;
    public SavingsAccount()
    {
        savingsBalance = 0;
        annualInterestRate = 0;
    }
    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
        annualInterestRate = 0;
        
    }
    public void calculateMonthlyInterest()
    {
        double interest;
        interest = (savingsBalance *((annualInterestRate)/100))/12;
        savingsBalance += interest;
        System.out.printf("\t%.2f",savingsBalance);
        
        
    }
    public static void setInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
        
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        System.out.println("Savings Account Balances");
        System.out.println("Month\tSaver1\tSaver2");
        
        for(int i=1;;i++){
            if(i<13){
                System.out.print(i);
                SavingsAccount.setInterestRate(4);
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
                System.out.println();
            }
            if (i==13){
                System.out.print(i);
                SavingsAccount.setInterestRate(5);
                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();
                System.out.println();
                
            }
            if(i>13) break;
            
            
            
        }
        
        
        
    }
    
}

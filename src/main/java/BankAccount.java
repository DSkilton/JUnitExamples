/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MC03353
 */
public class BankAccount {
    private double balance;
    private double minimumBalance;
    
    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        
    }
    
    public double withdraw(double amount){
        if(balance - amount > minimumBalance){
            balance -= amount;
            return amount;
        } else {
            throw new RuntimeException();
        }
    }
    
    public double deposit(double amount){
        return balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    
}

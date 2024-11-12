package org.example;

public class account {

    protected int number; // numero da conta
    protected String holder; // Titular da conta
    protected Double balance; // Saldo na conta

     public  account (Double balance, String holder, Double number){

     }

    public account() {

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public account(int number, String holder, Double balance) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }

    public void  whithdraw(double amount){
         balance -= amount + 5;
    }
    public void deposit(double amount){
         balance += amount;
    }
}

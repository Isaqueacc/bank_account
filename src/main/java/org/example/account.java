package org.example;

public class account {

    private String number; // numero da conta
    private String holder; // Titular da conta
    protected Double balance; // Saldo na conta

     public  account (){

     }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    public account(Double balance, String holder, String number) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }

    public void  whithdraw(double amount){
         balance -= amount;
    }
    public void deposit(double amount){
         balance += amount;
    }


}

package org.example;

public class savingsAccount extends account{
    private Double interestrate;

    public savingsAccount(){

    }

    public savingsAccount(int number, String holder, Double balance, Double interestrate) {
        super(number, holder, balance);
        this.interestrate = interestrate;
    }

    public Double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(Double interestrate) {
        this.interestrate = interestrate;
    }
public void updateBalance(){
        balance += balance * interestrate;
}

    @Override // metodo para sobrepor um metodo de outra classe
    public void whithdraw(double amount) {
        balance -= amount;
    }
}


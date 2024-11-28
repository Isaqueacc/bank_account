package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        account x = new account(1001, "Isaque",1000.0);
        account y = new savingsAccount(1002,"Lis",1000.0,0.01);
        x.whithdraw(50.0);
        y.whithdraw(50.0);
        // polimorfismo chamando a mesma variável porém de forma diferente

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

        }
    }
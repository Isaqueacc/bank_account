package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        account acc1 = new account(1001, "ISAQUE", 1000.0);
        acc1.whithdraw(200);
        System.out.println(acc1.getBalance());

        //MEtodo com override
        account acc2 = new savingsAccount(1002, "LIca", 1000.0, 0.01);
        acc2.whithdraw(200);
        System.out.println(acc2.getBalance());

        // metodo com super e override
         account acc3 = new businessAccount(1003,"Nino", 1000.0, 500.0);
         acc3.whithdraw(200.0);
        System.out.println(acc3.getBalance());
        }
    }
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        account acc = new account(1001, "Isaque", 0.0);
        businessAccount bacc = new businessAccount(1002, "Lis", 0.0, 500.0);

        // UPCASTING
        account acc1 = bacc; // recebendo o objeto que está na subclasse
                            // "Bussines Account e coolocando na classe principal account"

        account acc2 = new businessAccount(1003," nino", 0.0,200.0);
        account acc3 = new savingsAccount(1004, "Reinan", 0.0, 0.01);

        // Downcasting

        businessAccount acc4 = (businessAccount) acc2;
        acc4.loan(100.0);// parâmetro que permite fazer o downcasting
                                // podendo manipular as variaveis e funcôes

        //businessAccount acc5 = (businessAccount) acc3;
        if (acc3 instanceof businessAccount){
            businessAccount acc5 = (businessAccount)acc3;
            acc5.loan(200.00);

            System.out.println("Loan !");
        }
        if (acc3 instanceof savingsAccount){
            savingsAccount acc5 = (savingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update !");
        }
    }

}
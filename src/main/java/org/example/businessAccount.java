package org.example;

public class businessAccount extends account{
    private Double loanLimit;

    public businessAccount(){
        super(); // super sem argumentos para repetir uma certa logica na subclasse
    }

    public businessAccount(Double balance, String holder, String number, Double loanLimit) {
        super(balance, holder, number);
        this.loanLimit = loanLimit; // construtor para manipular as variáveis privadas
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }


    public void loan(double amount){ // função que empresata o dinheiro por meio de deposito
        if (amount <= loanLimit){
            balance += amount - 10.0;
            // estrutura condicional que só deposita a quantia na conta
            // se a quantia de emprestimo for maior ou igual ao limite de credito
        }
    }
}

package org.example;

public class businessAccount extends account{
    private Double loanLimit;

    public businessAccount(){
        super(); // super sem argumentos para repetir uma certa logica na subclasse
    }

    public businessAccount(int number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
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

    @Override // super com override sendo possivel chamar a implementação da superclasse usando a palavra super
    public void whithdraw(double amount) {
        super.whithdraw(amount);
        balance -= 2.0;
    }
}

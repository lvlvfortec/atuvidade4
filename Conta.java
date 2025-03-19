package javaapplication4;


public class Conta {

 
    private String titular;
    private double saldo=0;

    
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }


    public void depositar(double valor) {
        if (valor > 0) { 
            saldo += valor;  
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

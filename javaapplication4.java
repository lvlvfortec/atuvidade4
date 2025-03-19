
package javaapplication4;


public class javaapplication4 {


    public static void main(String[] args) {
        Conta conta = new Conta("aa",11);

        
        System.out.println("Saldo inicial  " + conta.getTitular() + ": R$" + conta.getSaldo());

      
        conta.depositar(500.0);


        System.out.println("Novo saldo  " + conta.getTitular() + ": R$" + conta.getSaldo());
    }
    
}

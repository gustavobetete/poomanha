package br.edu.fatecmm.prjconta.model;

/**
 * @version 1.0
 * @author Marcos Moraes
 * @since 2021 mar
 * Classe Conta, refere-se ao Requisito Funcional RF07
 */
public class Conta {
    private int numero;
    private String nomeCliente;
    private double saldo;
    //La no Governo, invetaram um imposto sobre saque
    private static double cpmf = 0.01;


    //gets sets


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getCpmf() {
        return cpmf;
    }

    //métodos

    /**
     *
     * @param valor - Valor referente ao saque informado.
     * @return true caso o saque seja realizado, ou false caso não tenha saldo suficiente
     * Impórtante que tenha sido debitao o valor do imposto cpmf
     */
    public boolean sacar(double valor){
        //verificar se tem o saldo, antes de fazer o saque
        if(valor <= saldo){
            double imposto = valor * cpmf;
            saldo -= (valor + imposto);
            return true;
        }
        return false;
    }

    /**
     *
     * @param valor - valor deve ser positivo
     * @return true se deposito for realizado, false se o valor informado para deposito for negativo ou zero
     */
    public boolean depositar(double valor){
        //verificar se o valor é maior que zero
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public void imprimir(){
        System.out.println("Dados da Conta");
        System.out.println("numero = " + numero);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
    }
}

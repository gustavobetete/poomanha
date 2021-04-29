package br.edu.fatecmm.heranca_conta.modelo;

import java.util.Date;

public class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;
    private String dataAbertura;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("numConta=").append(numConta).append("\n");
        sb.append("nomeCliente='").append(nomeCliente).append("\n");
        sb.append("saldo=").append(saldo);
        sb.append("dataAbertura='").append(dataAbertura).append("\n");
        return sb.toString();
    }
}

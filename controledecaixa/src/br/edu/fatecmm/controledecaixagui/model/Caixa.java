package br.edu.fatecmm.controledecaixagui.model;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor){
        if(valor < saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Saldo da Conta no momento: " + saldo;
    }
}

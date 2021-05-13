package br.edu.fatecmm.controledecaixagui.model;

import br.edu.fatecmm.controledecaixagui.utils.SemSaldoException;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SemSaldoException {
        if(valor > saldo){
            throw new SemSaldoException();
        }
        saldo -=valor;
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

package br.edu.fatecmm.controledecaixagui.utils;

public class SemSaldoException extends Exception{
    @Override
    public String getMessage() {
        //Fazer um mecanismo aqui para gravar o log dos erros dados no programa
        return "Sem saldo disponível para o saque";
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

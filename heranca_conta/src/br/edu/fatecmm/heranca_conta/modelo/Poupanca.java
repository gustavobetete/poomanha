package br.edu.fatecmm.heranca_conta.modelo;

public class Poupanca extends Conta {
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("diaAniversario=").append(diaAniversario).append("\n");
        return sb.toString();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato de Poupança");
        //aqui entraria
    }
}

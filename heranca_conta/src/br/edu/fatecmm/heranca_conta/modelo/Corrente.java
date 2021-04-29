package br.edu.fatecmm.heranca_conta.modelo;

public class Corrente extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        //regra do sacar para conta corrente
        if(valor <= (limite + getSaldo())){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(super.toString());
        sb.append("limite=").append(limite).append("\n");
        return sb.toString();
    }
}

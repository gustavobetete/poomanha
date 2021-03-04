package br.edu.fatecmm.prjapolice;

import br.edu.fatecmm.prjapolice.model.Apolice;

public class ApoliceTeste {
    public static void main(String[] args) {
	// write your code here
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Antonio Carlos da Silva");
        apolice.setIdade(24);
        apolice.setValorPremio(1500.88f);
        apolice.imprimir();
    }
}

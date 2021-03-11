package br.com.pfalves.projetocomputador;

public class ComputadorTeste {

    public static void main(String[] args) {
	    Computador computador1 = new Computador();
	    computador1.setMarca("hp");
	    computador1.setModelo("Novo");
	    computador1.setCor("Prata");
	    computador1.setNumeroSerie(123456);
	    computador1.setPreco(1000.0);
	    computador1.imprimir();
	    computador1.calcularValor();
		System.out.println();
	    computador1.imprimir();
		System.out.println();

	    Computador computador2 = new Computador();
	    computador2.setMarca("IbM");
	    computador2.setModelo("Usado");
	    computador2.setCor("Preta");
	    computador2.setNumeroSerie(22222222);
	    computador2.setPreco(2000);
	    computador2.imprimir();
		System.out.println();
		computador2.calcularValor();
		System.out.println();
		computador2.imprimir();
		System.out.println();

		int retorno = computador2.alterarValor(-1500);
		if(retorno==1){
			System.out.println("Preço do computador foi alterado com sucesso");
		}else{
			System.out.println("Valor informado invalido");
		}
		System.out.println();
		computador2.imprimir();
	}
}

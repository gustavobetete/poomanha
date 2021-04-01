package br.edu.fatecmm.prjporvalo;

public class Referencia {

    public static void meuMetodo(Pessoa p){
        p.setNome("Maria");
        p.setDiaNasc(7);
        System.out.println(p.hashCode());
        System.out.println(p.getNome());
        System.out.println(p.getDiaNasc());
    }

    public static void main(String[] args) {
	    Pessoa pessoa = new Pessoa();
	    pessoa.setNome("Camila");
	    pessoa.setDiaNasc(15);
	    meuMetodo(pessoa);
        System.out.println(pessoa.hashCode());
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDiaNasc());
    }
}

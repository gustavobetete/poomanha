package br.edu.fatecmm.prjporvalor;

public class Teste {

    public void alterar(int a){
        a+= 10;
        System.out.println("Valor do (a) no método: " + a);
    }

    public static void main(String[] args) {
	    int a = 12;
	    Teste teste = new Teste();
	    teste.alterar(a);
        System.out.println("Valor de (a) na volta: " + a);

    }
}

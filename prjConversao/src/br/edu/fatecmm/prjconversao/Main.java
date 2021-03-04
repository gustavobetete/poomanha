package br.edu.fatecmm.prjconversao;

public class Main {

    public static void main(String[] args) {
	    String strValor = "1234";
	    int mult = 10;
	    int resultado = Integer.parseInt(strValor) * mult;
        System.out.println("Resultado: " + resultado);

        //Situação inversa. Tenho o numero, e quero em formato de texto
        String strMult = String.valueOf(mult);
        String texto = "Multiplicador " + strMult + " Valor: " + strValor;
        System.out.println(texto);

    }
}

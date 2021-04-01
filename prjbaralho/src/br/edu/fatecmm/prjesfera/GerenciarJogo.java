package br.edu.fatecmm.prjesfera;

import br.edu.fatecmm.prjesfera.model.Baralho;
import br.edu.fatecmm.prjesfera.model.Carta;

public class GerenciarJogo {

    public static void main(String[] args) {
	// write your code here
        Baralho baralho = new Baralho();
        //Imprimir o baralho
        for(Carta carta : baralho.getCartas()){
            System.out.println(carta);
        }
        System.out.println("\nAgora embaralhado");
        System.out.println("=================");
        baralho.embaralhar();
        //Imprimir o baralho
        for(Carta carta : baralho.getCartas()){
            System.out.println(carta);
        }


    }
}

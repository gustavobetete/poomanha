package br.edu.fatecmm.prjloterica;

import br.edu.fatecmm.prjloterica.model.Tabuleiro;

import java.util.Scanner;

public class GerenciarJogo {

    public static void main(String[] args) {
	// write your code here
        Tabuleiro tabu = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro palpite: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o segundo palpite: ");
        int b = Integer.parseInt(sc.nextLine());
        double valorPremio = tabu.jogar(a, b);
        if(valorPremio > 0){
            System.out.println("Parabéns, seu prêmio: " + valorPremio);
        }else{
            System.out.println("Infelizmente não é vencedor");
        }
    }
}

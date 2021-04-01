package br.edu.fatecmm.prjesfera;

import br.edu.fatecmm.prjesfera.model.Tabuleiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o palpite 1 e 2");
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        double premio = tabuleiro.jogar(x, y);
        if(premio > 0){
            System.out.println("Ganhou: " + premio);
        }else{
            System.out.println("Não ganhou");
        }
    }
}

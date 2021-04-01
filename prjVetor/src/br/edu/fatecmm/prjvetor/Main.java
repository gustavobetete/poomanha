package br.edu.fatecmm.prjvetor;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int num[] = new int[10];
	    //Pedir ao usuário os dez dados
        //Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Digite o valor para a posição " + i);
//            num[i] = Integer.parseInt(input.nextLine());
//        }
        Arrays.fill(num, 15);
        //preenche o vetor com um valor
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor na Posição: " + i + " ==> " + num[i]);
        }

    }
}

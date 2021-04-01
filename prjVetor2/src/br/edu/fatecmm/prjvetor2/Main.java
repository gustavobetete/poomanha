package br.edu.fatecmm.prjvetor2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Criar dois vetores de mesmo tamanho
        //um com dados, e o outro vazio
        //copiar 4 dados da posicao 3 do vetor1 para o final do vetor2
        int v1[] = {3,5,1,9,7,11,13,15,17,19};
        Arrays.sort(v1);

        int v2[] = new int[10];

        System.arraycopy(v1, 3, v2, 6, 4);
        for (int i = 0; i < v2.length; i++) {
            System.out.println(v2[i]);
        }
        System.out.println();
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i]);
        }

    }
}

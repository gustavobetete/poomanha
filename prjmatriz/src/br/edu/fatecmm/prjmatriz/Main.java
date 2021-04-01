package br.edu.fatecmm.prjmatriz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int matriz[][] = new int[9][9];

        for (int i = 0; i < matriz[0].length; i++) {
            matriz[i][i] = 1;
        }

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("[%2d] ", matriz[i][j]);
            }
            System.out.println();
        }

    }
}

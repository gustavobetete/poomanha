package br.edu.fatecmm.prjloterica.model;

import java.util.Random;

public class Tabuleiro {
    private int matriz[][] = new int[10][10];
    private int palpites[] = new int[2];

    public Tabuleiro(){
        //Lógica para gerar os 100 números entre 0 e 100 para a matriz
        Random random = new Random();
        //varrer a matriz e alimentar com o dado gerado
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }
    }
    public double jogar(int x, int y){
        //validar os valores de x e y antes de executar a busca pelo
        //palpite na matriz
        String erro = "Valor do palpite deve estar entre 0 e 100";
        if((x < 0) || (x > 100) || ((y < 0) || (y>100))){
            throw new IllegalArgumentException("Aconteceu o erro: " + erro);
        }
        palpites[0] = x;
        palpites[1] = y;
        double premio = procurarPalpite();
        listar();
        return premio;
    }

    private void listar() {
        //Listar o tabuleiro identificando os acertos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(palpites[0]==matriz[i][j] || (palpites[1]==matriz[i][j])){
                    System.out.printf("[%3d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%3d]  ", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    private double procurarPalpite(){
        int acertos = 0;
        double premio = 0.0;
        for(int p = 0; p < 2; p++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(palpites[p]==matriz[i][j]) acertos++;
                }
            }
        }
        if(acertos >= 3){
            premio = acertos * 1000.0;
        }
        return premio;
    }
}

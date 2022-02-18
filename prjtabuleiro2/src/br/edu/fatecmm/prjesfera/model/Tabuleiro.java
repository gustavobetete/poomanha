package br.edu.fatecmm.prjesfera.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tabuleiro {
    private List<Integer> tabuleiro = new ArrayList<>();
    private List<Integer> palpites = new ArrayList<>();

    public Tabuleiro(){
        Random random  = new Random();
        for (int i = 1; i < 26; i++) {
            tabuleiro.add(random.nextInt(76));
        }
    }

    public double jogar(int x, int y){
        palpites.add(x);
        palpites.add(y);
        int acertos = 0;
        double premio = 0;
        for(int z : tabuleiro){
            for(int p : palpites){
                if(z==p) acertos++;
            }
        }
        if(acertos >= 3){
            premio = acertos * 1000.0;
        }
        listar();
        return premio;
    }

    private void listar(){
        int i = 0;
        for (int x : tabuleiro) {
            i++;
            if((x == palpites.get(0)) || (x== palpites.get(1))){
                System.out.printf("[%3d]* ", x);
            }else{
                System.out.printf("[%3d]  ", x);
            }
            if(i % 5 == 0) System.out.println();

        }
    }
}

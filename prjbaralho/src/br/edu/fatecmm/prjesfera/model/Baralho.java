package br.edu.fatecmm.prjesfera.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Um Baralho é composto de 52 cartas 13 valores x 4 naipes
* Estratégia, montar uma lista com todas estas cartas
* */
public class Baralho {
    private List<Carta> cartas = new ArrayList<>();

    public List<Carta> getCartas() {
        return cartas;
    }

    public Baralho(){
        //Montar um baralho
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta();
                carta.setNaipe(naipe);
                carta.setValor(valor);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }
}

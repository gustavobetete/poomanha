package br.edu.fatecmm.prjestacionamento_2502.model;

public class Carro {
    //atributos
    private int id;
    private String nome;
    private String marca;
    private int anoModelo;
    private int anoFabricacao;
    private boolean ativo;

    //Construtores
    public Carro(int id, String nome, String marca, int anoModelo, int anoFabricacao){
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.ativo = true;
    }

    //métodos da classe
    public void entradaEstacionamento(){
        System.out.println("Entrada do carro: " + nome + " no estacionamento");
    }


    @Override
    public String toString() {
        return "Carro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", anoModelo=" + anoModelo +
                ", anoFabricacao=" + anoFabricacao +
                ", ativo=" + ativo +
                '}';
    }
}

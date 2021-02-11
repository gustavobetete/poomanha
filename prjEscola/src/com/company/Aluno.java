package com.company;

public class Aluno {
    //atributos
    public int ra;
    public String nome;
    public String email;
    private double salario;

    //métodos
    public void matricular(){
        System.out.println("Aluno: " + nome + " foi matriculado(a)");
    }
    public void trancarMatricula(){
        System.out.println("Aluno de ra: " + ra + " trancou a matricula");
    }
    public void trocarDisciplina(){
        System.out.println("Deixou de fazer POO para fazer Gestão Empresarial");
    }
}

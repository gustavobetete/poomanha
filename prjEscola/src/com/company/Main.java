package com.company;

public class Main {

    public static void main(String[] args) {
	    Aluno paulo;
	    Aluno vanessa;
	    paulo = new Aluno();
	    vanessa = new Aluno();
	    paulo.ra = 11;
	    paulo.nome = "Paulo Santos";
	    paulo.email = "paulo@gmail.com";
	    paulo.matricular();
	    paulo.trancarMatricula();
    }
}

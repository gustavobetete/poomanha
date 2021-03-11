package br.com.pfalves.projetoacampamento;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome: ");
        membro.setNome(input.nextLine());
        System.out.println("Digite a idade: ");
        membro.setIdade(Integer.parseInt(input.nextLine()));
        //invocar o método imprimir
        membro.imprimir();
        System.out.println();
        membro.separarGrupo();
        membro.imprimir();
    }
}

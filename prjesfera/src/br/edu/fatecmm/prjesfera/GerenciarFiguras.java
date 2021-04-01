package br.edu.fatecmm.prjesfera;

import br.edu.fatecmm.prjesfera.model.Esfera;

import java.util.Scanner;

public class GerenciarFiguras {

    public static void main(String[] args) {
	// write your code here
        Esfera esfera = new Esfera();
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para cálculo do volume de um esfera");
        System.out.println("Digite o valor do raio: ");
        double raio = Double.parseDouble(sc.nextLine());
        esfera.setRaio(raio);
        double resultado = esfera.calcularVolume();
        System.out.println("Volume é: " + resultado);
    }
}

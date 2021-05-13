package br.edu.fatecmm.gerenciamento_erro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            int a, b;
            //supondo que você tenha feito um abertura de conexão com banco de dados
            //para gravar uma informação
            System.out.println("Banco de dados aberto...");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor inteiro: ");
            a = sc.nextInt();
            System.out.println("Digite outro valor inteiro: ");
            b = sc.nextInt();
            int c = a / b;
            System.out.println("Resultado da divisão: " + c);
        }catch(InputMismatchException exception){
            System.out.println("Entrada de dado inválida. Esperado valor inteiro");
        }catch(ArithmeticException exception){
            System.out.println("Impossível dividir inteiro por zero");
        }catch(Exception exception){
            System.out.println("Aconteceu um erro inesperado, contacte o Adm do sistema");
            System.out.println("Informe a mensagem de erro: " + exception.getClass());
        }finally {
            System.out.println("Fechar o banco");
        }


    }
}

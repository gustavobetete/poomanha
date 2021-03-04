package br.edu.fatecmm.prjconta;

import br.edu.fatecmm.prjconta.model.Conta;

import java.util.Scanner;

public class GerenciarConta {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    Conta conta1 = new Conta();
		System.out.println(Conta.getCpmf());

		//Para nunca ter problemas com buffer
		//Pedir os dados da conta para o usuário
		System.out.println("Digite o numero da conta: ");
	    conta1.setNumero(Integer.parseInt(input.nextLine()));
		System.out.println("Digite o nome do cliente: ");
	    conta1.setNomeCliente(input.nextLine());
		System.out.println("Digite o valor do deposito: ");
	    conta1.depositar(Double.parseDouble(input.nextLine()));
		System.out.println("Digite o valor do saque: ");
		boolean sacou = conta1.sacar(Double.parseDouble(input.nextLine()));
		conta1.imprimir();
		if(sacou){
			System.out.println("Saque Realizado com sucesso");
		}else{
			System.out.println("Não há saldo para o saque");
		}
    }
}

package br.edu.fatecmm.heranca_conta;

import br.edu.fatecmm.heranca_conta.modelo.Conta;
import br.edu.fatecmm.heranca_conta.modelo.Corrente;
import br.edu.fatecmm.heranca_conta.modelo.Poupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Apresentar menu com opções para várias contas
public class GerenciarContas {

    //Atributo para guardar contas cadastradas
    List<Conta> listaDeContas = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarContas gc = new GerenciarContas();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("Menu da Aplicação Bancos");
            System.out.println("1.. Cadastrar Nova Conta");
            System.out.println("2.. Depositar em uma Conta");
            System.out.println("3.. Sacar de uma Conta");
            System.out.println("4.. Mostrar saldo de uma Conta");
            System.out.println("5.. Listar todas as Contas");
            System.out.println("6.. Patrimônio Líquido do Banco");
            System.out.println("9.. SAIR do Programa");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    gc.execCadastrar();
                    break;
                case 2:
                    gc.execDepositar();
                    break;
                case 3:
                    gc.execSacar();
                    break;
                case 4:
                    gc.execMostrarSaldo();
                    break;
                case 5:
                    gc.listarTodasAsContas();
                    break;
                case 6:
                    gc.exibirPatrimonio();
                    break;
                case 9:
                    System.out.println("FIM DO PROGRAMA");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opc != 9);
    }

    public void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        int tipo;
        do {
            System.out.println("Deseja cadastrar qual tipo de conta");
            System.out.println("1.. Conta Corrente");
            System.out.println("2.. Poupança");
            System.out.println("Opção: ");
            tipo = Integer.parseInt(sc.nextLine());
        }while(tipo <1 || tipo>2);
        if (tipo == 1){
            conta = new Corrente();
        }else{
            conta = new Poupanca();
        }
        System.out.println("Digite o número da Conta..: ");
        conta.setNumConta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do Cliente..:");
        conta.setNomeCliente(sc.nextLine());
        System.out.println("Digite a data de Abertura..:");
        conta.setDataAbertura(sc.nextLine());
        if(tipo == 1){
            System.out.println("Digite o limite do cheque especial..:");
            Corrente aux = (Corrente)conta;
            aux.setLimite(Double.parseDouble(sc.nextLine()));
        }else{
            System.out.println("Digite o dia de aniversário da poupança..:");
            Poupanca aux = (Poupanca) conta;
            aux.setDiaAniversario(Integer.parseInt(sc.nextLine()));
        }
        listaDeContas.add(conta);
        System.out.println("Conta Cadastrada com Sucesso");

    }

    public void execDepositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta.:");
        int contaProcurada = Integer.parseInt(sc.nextLine());
        //Varrer a lista a procura da conta informada
        for (Conta conta : listaDeContas) {
            if(contaProcurada == conta.getNumConta()){
                System.out.println("Digite o valor do depósito: ");
                double valorDeposito = Double.parseDouble(sc.nextLine());
                boolean depositou = conta.depositar(valorDeposito);
                if(depositou) {
                    System.out.println("Depósito efetuado com sucesso..");
                }else{
                    System.out.println("Valor deve ser positivo para depósito");
                }
                return;
            }
        }
        System.out.println("Conta não encontrada");
    }

    public void execSacar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta.:");
        int contaProcurada = Integer.parseInt(sc.nextLine());
        //Varrer a lista a procura da conta informada
        for (Conta conta : listaDeContas) {
            if(contaProcurada == conta.getNumConta()){
                System.out.println("Digite o valor do saque: ");
                double valorSaque = Double.parseDouble(sc.nextLine());
                boolean sacou = conta.sacar(valorSaque);
                if(sacou) {
                    System.out.println("Saque efetuado com sucesso..");
                }else{
                    System.out.println("Não tem saldo nem limites suficientes");
                }
                return;
            }
        }
        System.out.println("Conta não encontrada");
    }

    public void execMostrarSaldo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta.:");
        int contaProcurada = Integer.parseInt(sc.nextLine());
        //Varrer a lista a procura da conta informada
        for (Conta conta : listaDeContas) {
            if (contaProcurada == conta.getNumConta()) {
                System.out.println("Saldo atual: " + conta.getSaldo());
                return;
            }
        }
        System.out.println("Conta não encontrada");
    }

    public void listarTodasAsContas(){
        for(Conta conta : listaDeContas){
            System.out.println(conta.toString());
            System.out.println("---------------------------------");
        }
    }

    public void exibirPatrimonio(){
        double total = 0;
        for (Conta conta: listaDeContas) {
            total+= conta.getSaldo();
        }
        System.out.println("Total do Patrimônio do Banco: " + total);
    }
}

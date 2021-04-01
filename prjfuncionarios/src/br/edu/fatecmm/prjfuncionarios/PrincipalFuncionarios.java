package br.edu.fatecmm.prjfuncionarios;

import br.edu.fatecmm.prjfuncionarios.model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalFuncionarios {

    List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        PrincipalFuncionarios pf = new PrincipalFuncionarios();
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar Funcionário");
            System.out.println("2.. Bonificar Funcionário");
            System.out.println("3.. Consultar Funcionáarios");
            System.out.println("9.. SAIR");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    pf.execCadastrar();
                    break;
                case 2:
                    pf.execBonificar();
                    break;
                case 3:
                    pf.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        //1. Criar um funcionário
        //2. Pedir os dados para o usuário
        //3. Colocar o funcionário na lista
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        System.out.println("Digite o nome: ");
        f.setNome(sc.nextLine());
        System.out.println("Digite o departamento: ");
        f.setDepartamento(sc.nextLine());
        System.out.println("Digite o salário: ");
        f.setSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o rg: ");
        f.setRg(sc.nextLine());
        f.setActivated(true);
        System.out.println("Dados cadastrados com sucesso");
        funcionarios.add(f); //Adicionei na lista funcionarios

    }
    public void execBonificar(){
        //1. Pedir para o usuário quem ele quer bonificar
        //2. Pedir para o usuário o valor do aumento
        //3. Procurar se existe na lista o funcionário que ele diz vai bonificar
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o RG do funcionário a bonificar: ");
        String rgProc = sc.nextLine();
        //procurar este rg na lista de funcionarios
        for(Funcionario f : funcionarios){
            if(rgProc.equals(f.getRg())){
                //Aqui você encontrou o funcionário procurado
                System.out.println("Digite o valor do aumento: ");
                double aumento = Double.parseDouble(sc.nextLine());
                f.bonificar(aumento);
                System.out.println("Funcionário bonificado..");
                return;
            }
        }
        System.out.println("Funcionário não localizado");

    }
    public void execConsultar(){
        //1. Varrer a lista e imprimir
        for(Funcionario f : funcionarios){
            System.out.println(f.toString());
        }
    }
}

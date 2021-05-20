package net.maromo.projeto_hash;

import net.maromo.projeto_hash.model.Pessoa;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    //Aplicar o hashCode para três pessoas
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        p1.setIdPessoa(498);
        p1.setNomePessoa("Marcos");
        p2.setIdPessoa(11);
        p2.setNomePessoa("Pedro");
        p3.setIdPessoa(888);
        p3.setNomePessoa("Tamares");
        //
        List<Pessoa> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        System.out.println("Hashcode de p1: " + p1.hashCode());
        System.out.println("Hashcode de p2: " + p2.hashCode());
        System.out.println("Hashcode de p3: " + p3.hashCode());
        //Verificar se um objeto é igual a outro
        Scanner sc = new Scanner(System.in);
        Pessoa pproc = new Pessoa();
        System.out.println("Digite o id da pessoa da procurada");
        pproc.setIdPessoa(Integer.parseInt(sc.nextLine()));
        if(lista.contains(pproc)){
            System.out.println("Encontrado na lista");
            System.out.println("Nome da pessoa: " + lista.get(lista.indexOf(pproc)).getNomePessoa());
        } else{
            System.out.println("Não encontrado");
        }
        Collections.sort(lista);
        for (Pessoa p: lista) {
            System.out.println(p);
        }

    }
}

package br.edu.fatecmm.prjestacionamento_2502;

import br.edu.fatecmm.prjestacionamento_2502.model.Carro;
import br.edu.fatecmm.prjestacionamento_2502.model.Cliente;

public class Gerenciar {

    public static void main(String[] args) {
	    //Dar vida aos objetos
        //Dois novos carros. Honda Civic e um Sentra
        Carro honda = new Carro(111,
                "Honda Civic",
                "Honda",
                2020,
                2020);
        Carro sentra = new Carro(222,
                "Sentra",
                "Nissan",
                2020,
                2020);
        honda.entradaEstacionamento();
        sentra.entradaEstacionamento();

        String dadoHonda = honda.toString();
        String dadosSentra = sentra.toString();

        //comando para imprimir na tela
        System.out.println(dadoHonda);
        System.out.println(dadosSentra);

        Cliente cliente = new Cliente();
        cliente.setId(12);
        cliente.setNome("Marcos");
        cliente.setTelefone("12-1222-2222");

        System.out.println("Telefone do " + cliente.getNome());
        System.out.println("Numero: " + cliente.getTelefone());


    }
}

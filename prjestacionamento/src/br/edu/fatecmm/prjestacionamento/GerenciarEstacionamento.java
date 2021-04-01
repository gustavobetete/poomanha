package br.edu.fatecmm.prjestacionamento;

import br.edu.fatecmm.prjestacionamento.model.Carro;
import br.edu.fatecmm.prjestacionamento.model.Pessoa;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
	    //Definir dois novos objetos do tipo Pessoa (clientes)
        //Definir três veículos (objetos do tipo Carro)
        Carro carro1 = new Carro();
        carro1.setIdCarro(1);
        carro1.setMarca("Fiat");
        carro1.setModelo("Toro");
        carro1.setAnoFabricacao(2020);

        Carro carro2 = new Carro();
        carro2.setIdCarro(2);
        carro2.setMarca("Fiat");
        carro2.setModelo("Palio");
        carro2.setAnoFabricacao(2015);

        Carro carro3 = new Carro();
        carro3.setIdCarro(3);
        carro3.setMarca("Nissan");
        carro3.setModelo("Sentra");
        carro3.setAnoFabricacao(2018);

        Pessoa cliente1 = new Pessoa();
        cliente1.setIdPessoa(1);
        cliente1.setNome("Camila");
        cliente1.setEmail("camila@fatec.sp.gov.br");
        cliente1.setTelefone("9999-9999");
        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);

        Pessoa cliente2 = new Pessoa();
        cliente2.setIdPessoa(2);
        cliente2.setNome("Ricardo");
        cliente2.setEmail("email@gmail.com");
        cliente2.setTelefone("8888-8888");
        cliente2.adicionarCarro(carro3);

        Pessoa pessoaSemCarro = new Pessoa();
        pessoaSemCarro.setIdPessoa(3);
        pessoaSemCarro.setNome("Chico");
        pessoaSemCarro.setEmail("chico@gmail.com");
        pessoaSemCarro.setTelefone("7777-7777");

        cliente1.imprimir();
        System.out.println();
        cliente2.imprimir();
        System.out.println();
        pessoaSemCarro.imprimir();
    }
}

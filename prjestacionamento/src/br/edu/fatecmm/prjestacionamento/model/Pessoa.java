package br.edu.fatecmm.prjestacionamento.model;


import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String email;
    private String telefone;
    //criar o relacionamento com a classe Carro
    //Tipo: Composição [0..N]
    private List<Carro> carros = new ArrayList<>();

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Método para adicionar um carro na lista
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    public void imprimir(){
        System.out.println("Dados do Cliente e de seu veículo ");
        System.out.println("idPessoa = " + idPessoa);
        System.out.println("nome = " + nome);
        System.out.println("email = " + email);
        System.out.println("telefone = " + telefone);
        if(carros.size()>0){
            System.out.println("Total de Veículos: " + carros.size());
            for(Carro carro : carros){
                System.out.println("Id do Carro: = " + carro.getIdCarro());
                System.out.println("Marca do carro = " + carro.getMarca());
                System.out.println("modelo do carro = " + carro.getModelo());
                System.out.println("Ano de Fabricação:  = " + carro.getAnoFabricacao());
            }
        }else{
            System.out.println("Cliente: " + nome + " não possui veículos ");
        }


    }
}

package br.edu.fatecmm.prjestacionamento_2502.model;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;

    //gets para ler e os sets para gravar os dados
    //Mágica do Intellij
    //<ALT + INSERT>

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

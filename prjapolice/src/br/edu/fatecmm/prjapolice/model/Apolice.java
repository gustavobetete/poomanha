package br.edu.fatecmm.prjapolice.model;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    //gerar os métodos gets e sets
    //<ALT> + <INSERT>

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir(){
        System.out.println("Dados da apolice");
        System.out.println("nomeSegurado = " + nomeSegurado);
        System.out.println("idade = " + idade);
        System.out.println("valorPremio = " + valorPremio);
    }


}

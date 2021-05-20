package net.maromo.projeto_hash.model;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private int idPessoa;
    private String nomePessoa;

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    //Analogia das caixas


    @Override
    public boolean equals(Object o) {
        if ((o instanceof Pessoa) && ((Pessoa) o).idPessoa == this.idPessoa) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //Algoritmo (analogia das caixas)
        return nomePessoa.length();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("-----------------------------------------\n");
        sb.append("Id da Pessoa: ").append(idPessoa).append("\n");
        sb.append("Nome da Pessoa: ").append(nomePessoa).append("\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.idPessoa < o.idPessoa) return -1;
        if (this.idPessoa > o.idPessoa) return 1;
        return 0;
    }
}

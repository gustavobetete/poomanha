package br.edu.fatecmm.prjfuncionarios.model;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private boolean activated;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void bonificar(double aumento){
        if(aumento <=0){
            throw new IllegalArgumentException("Aumento deve ser positivo");
        }
        salario += aumento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", rg='" + rg + '\'' +
                ", ativo na empresa=" + activated +
                '}';
    }
}

package br.edu.fatecmm.prjacademico.model;


public class Aluno {
    private int ra;
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private Sexo sexo;



    //Métodos construtores
    public Aluno(){

    }
    //<Alt > + <Insert>
    public Aluno(int ra, String nome, String email, String usuario, String senha) {
        this(usuario, senha);
        this.ra = ra;
        this.nome = nome;
        this.email = email;

    }

    public Aluno(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
        //System.out.println("Checar se senha está válida..");
        //System.out.println(this.hashCode());
        //verificarLogin(this);
    }

    private void verificarLogin(Aluno aluno) {
        System.out.println(aluno.hashCode());
        //fui no banco e achei essas informações
        if(aluno.usuario.equals("adm") && aluno.senha.equals("123")){
            aluno.nome = "Administrador do sistema";
            aluno.email = "sysfatec@gmail.com";
            aluno.ra = 99999;
        }else{
            throw new IllegalArgumentException("Usuário inválido");
        }
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}

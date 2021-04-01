package br.edu.fatecmm.prjacademico;

import br.edu.fatecmm.prjacademico.model.Aluno;
import br.edu.fatecmm.prjacademico.model.Sexo;

public class GerenciarEscola {

    public static void main(String[] args) {
	// write your code here
        Aluno aluno1 = new Aluno();
        aluno1.setRa(1);
        aluno1.setNome("Camila");
        aluno1.setEmail("camila@fatec.sp.gov.br");
        aluno1.setUsuario("camila");
        aluno1.setSenha("3333");
        aluno1.setSexo(Sexo.Feminino);

        Aluno admSistema = new Aluno("adm", "124");

        System.out.println(aluno1.toString());
        System.out.println();

        System.out.println(admSistema.toString());



    }
}

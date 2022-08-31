package br.unicesumar.aula;

import br.unicesumar.aula.modelo.*;

public class Principal {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];
        Academico[] academicos = new Academico[2];

        Professor professor = new Professor();
        professor.setNome("Edson");
        professor.setCpf("123456");
        professor.setPeriodo(Periodo.NOTURNO);
        funcionarios[0] = professor;
        academicos[0] = professor;


        Atendente atendente = new Atendente();
        atendente.setEscala("08hs as 18hs");
        funcionarios[1]=atendente;

        Aluno aluno = new Aluno();
        aluno.setNome("Gustavo");
        aluno.setMatricula(2154);
        academicos[1]=aluno;

        for (int i = 0; i < academicos.length; i++) {
            System.out.println("Exibir Academicos");
            verificarDadosAcademicos(academicos[i]);
        }

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Exibir funcionarios");
            verificarEscala(funcionarios[i]);
        }
        System.out.println("\n\n");
        for (int i = 0; i < funcionarios.length; i++) {
            for (int j = 0; j < academicos.length; j++) {
                if (academicos[j]== funcionarios[i]){
                    System.out.println("O "+academicos[j].getNome()+"\n" +
                            "É Academico e Funcionário");
                }
            }
        }

    }

    public static void verificarEscala(Funcionario funcionario){
        System.out.println("A escala é: "+ funcionario.escalaTrabalho());
    }

    public static void verificarDadosAcademicos(Academico academico){
        System.out.println("O ID do academico é: "+ academico.getCodigoIdentificacao());
        System.out.println("O nome: "+academico.getNome());
    }
}

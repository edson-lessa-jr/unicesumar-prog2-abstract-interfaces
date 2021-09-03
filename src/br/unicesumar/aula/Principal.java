package br.unicesumar.aula;

import br.unicesumar.aula.modelo.*;

public class Principal {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Edson");
        professor.setCpf("1253456");
        professor.setPeriodo(Periodo.NOTURNO);

        Atendente atendente = new Atendente();
        atendente.setEscala("08hs as 12hs e 13hs as 18hs");

        Aluno aluno = new Aluno();
        aluno.setNome("Gustavo");
        aluno.setMatricula(1234);

        //        Polimorfismo

        System.out.println("Exibir dados aluno");
        verificarDadosAcademico(aluno);

        System.out.println("Exibir dados professor");
        verificarDadosAcademico(professor);

        System.out.println("\n");

        System.out.println("Exibe a escala do professor");
        verificarEscalaAcesso(professor);
        System.out.println("Exibe a escala do atendente");
        verificarEscalaAcesso(atendente);
    }

    public static void verificarEscalaAcesso(Funcionario funcionario){
        System.out.println("A escala é: "+ funcionario.escalaTrabalho());
    }

    public static void verificarDadosAcademico(Academico academico){
        System.out.println("O ID do academico é: "+ academico.getCodigoIdentificador());
        System.out.println("O nome: "+academico.getNome());
    }

}

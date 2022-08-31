package br.unicesumar.aula.modelo;

public class Aluno extends Academico{
    private int matricula;


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getCodigoIdentificacao() {
        return this.matricula+"";
    }
}

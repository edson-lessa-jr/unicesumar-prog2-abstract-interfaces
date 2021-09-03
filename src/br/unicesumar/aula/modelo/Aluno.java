package br.unicesumar.aula.modelo;

public class Aluno extends Academico{
    private int matricula;

    @Override
    public String getCodigoIdentificador() {
        return this.matricula+"";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

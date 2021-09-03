package br.unicesumar.aula.modelo;

public class Atendente implements Funcionario{
    private String escala;

    @Override
    public String escalaTrabalho() {
        return this.getEscala();
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }
}

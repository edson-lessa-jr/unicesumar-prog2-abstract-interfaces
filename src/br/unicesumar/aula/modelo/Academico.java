package br.unicesumar.aula.modelo;

public abstract class Academico {
    private String nome;

    public abstract String getCodigoIdentificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


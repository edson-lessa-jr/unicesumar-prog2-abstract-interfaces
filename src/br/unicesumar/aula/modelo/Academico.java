package br.unicesumar.aula.modelo;

public abstract class Academico {
    private String nome;

    public abstract String getCodigoIdentificador();

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
}

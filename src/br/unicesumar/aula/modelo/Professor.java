package br.unicesumar.aula.modelo;

public class Professor extends Academico implements Funcionario{
    private String cpf;
    private Periodo periodo;



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }


    @Override
    public String getCodigoIdentificacao() {
        return this.cpf;
    }

    @Override
    public String escalaTrabalho() {
        return periodo.name();
    }
}


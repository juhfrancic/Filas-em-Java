package org.example.ExemploPaciente;

public class Paciente implements Comparable<Paciente>{
    String nome;
    int prioridade;

    public Paciente(String nome, int prioridade){
        this.nome = nome;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Paciente outro){
        //Garante que a maior prioridade venha primeiro
        return outro.prioridade - this.prioridade;
    }
}

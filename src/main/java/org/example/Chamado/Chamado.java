package org.example.Chamado;

public class Chamado implements Comparable<Chamado>{
    public String descricao;
    public int prioridade;
    public Chamado(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Chamado outro){
        return outro.prioridade - this.prioridade;
    }
}

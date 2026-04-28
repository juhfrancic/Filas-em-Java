package org.example;

import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Chamado> fila = new PriorityQueue<>();
        fila.add(new Chamado("Caiu", 2));
        fila.add(new Chamado("Computador não liga", 5));
        fila.add(new Chamado("Erro no sistema", 4));
        fila.add(new Chamado("Troca de senha", 3));
        fila.add(new Chamado("Quebrou", 1));

        while(!fila.isEmpty()){
            Chamado  chamado = fila.poll();
            System.out.println(chamado.descricao + " - prioridade: " + chamado.prioridade);
        }
    }
}
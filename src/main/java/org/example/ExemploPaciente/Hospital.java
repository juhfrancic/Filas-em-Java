package org.example.ExemploPaciente;

import java.util.PriorityQueue;

public class Hospital {
    public static void main(String[] args){
        PriorityQueue<Paciente> fila = new PriorityQueue<>();
        fila.add(new Paciente("João", 2));
        fila.add(new Paciente("Maria", 5));
        fila.add(new Paciente("Paula", 1));

        while(!fila.isEmpty()){
            Paciente p = fila.poll();
            System.out.println(p.nome + " - prioridade: " + p.prioridade);
        }
    }
}

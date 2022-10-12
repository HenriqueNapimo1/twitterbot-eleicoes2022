package com.henriquenapimo1;

public class Candidato {

    public String nome;
    public String partido;
    public int num;

    public int pos;
    public Long votos;
    public String porcent;

    public String urnas;

    public Candidato(String nome,int num, int pos,Long votos,String porcent, String partido, String urnas) {
        this.nome = nome;
        this.num = num;
        this.pos = pos;
        this.votos = votos;
        this.porcent = porcent;
        this.partido = partido;
        this.urnas = urnas;
    }

    public String cor() {
        return nome.equals("LULA") ? "red" : "blue";
    }


}

package br.univali.questao3;

public class Produto {
    public String nome;
    public int identificadorNumerico;
    public Produto(String nome, int identificadorNumerico) {
        this.nome = nome;
        this.identificadorNumerico = identificadorNumerico;
    }
    public void mostrarDados () {
        System.out.println("Sou da classe Produto");
        System.out.println(nome);
        System.out.println(identificadorNumerico);
    }
}

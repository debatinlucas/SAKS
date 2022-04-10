package br.univali.questao3;

public class Televisor extends Produto {
    public String marca;
    public Televisor(String nome, int identificadorNumerico, String marca) {
        super(nome, identificadorNumerico);
        this.marca = marca;
    }
    
    public void mostrarDados () {
        System.out.println("Sou da classe Televisor");
        System.out.println(nome);
        System.out.println(identificadorNumerico);
        System.out.println(marca);
    }
}

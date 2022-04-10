package br.univali.questao3;

public class DVD extends Produto {
    public String titulo;
    public float preco;
    public DVD(String nome, int identificadorNumerico, String titulo, float preco) {
        super(nome, identificadorNumerico);
        this.titulo = titulo;
        this.preco = preco;
    }
    
    public void mostrarDados () {
        System.out.println("Sou da classe DVD");
        System.out.println(nome);
        System.out.println(identificadorNumerico);
        System.out.println(titulo);
        System.out.println(preco);
    }
}

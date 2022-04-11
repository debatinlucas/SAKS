package br.univali.questao3;

public class Main {
    public static void main (String[] args) {
        Produto p = new Produto("Caneta", 1);
        Televisor t = new Televisor("SmartTV", 2, "LG");
        DVD d = new DVD("Blu-ray", 3, "Homem-aranha", 20);
        p.mostrarDados();
        System.out.println("##########");
        
        p = t;
        p.mostrarDados();
        System.out.println("##########");
        
        p = d;
        p.mostrarDados();
        System.out.println("##########");
    }
}

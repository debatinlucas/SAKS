package br.univali.questao2;

public class Pessoa {
    public String nome, endereco, sexo;
    public int idade;
    
    public Pessoa (String nome, String endereco, int idade, String sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void saudacao () {
        System.out.println("Ola! Meu nome é " + this.nome);
    }
}

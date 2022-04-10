package br.univali.questao1_2.poo;

public class Veiculo {
    private String modelo, cor;
    private int ano;
    
    public Veiculo () { }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo () {
        return this.modelo;
    }
    
    public void setCor (String cor) {
        this.cor = cor;
    }
    
    public String getCor () {
        return this.cor;
    }
    
    public void setAno (int ano) {
        this.ano = ano;
    }
    
    public int getAno () {
        return this.ano;
    }
    
    public void exibe (String modelo, String cor, int ano) {
        System.out.println(modelo);  
        System.out.println(cor);
        System.out.println(ano);
    } 
}

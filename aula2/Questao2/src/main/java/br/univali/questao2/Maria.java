package br.univali.questao2;

public class Maria extends Pessoa implements AcoesPessoa {
    
    public Maria () {
        super("Maria", "Rua Cunha", 28, "Feminino");
    }
    
    public void andar() {
        System.out.println("estou andando");
    }
    
    public void parar() {
        System.out.println("parei de andar");
    }
}

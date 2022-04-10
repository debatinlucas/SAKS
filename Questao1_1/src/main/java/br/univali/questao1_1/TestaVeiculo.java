package br.univali.questao1_1;

import br.univali.questao1_1.poo.Veiculo;

public class TestaVeiculo {
    public static void main (String[] args) {
        Veiculo fiat = new Veiculo("Uno", "branco", 2010);
        System.out.println(fiat.modelo);  
        System.out.println(fiat.cor);
        System.out.println(fiat.ano);
        
        Veiculo honda = new Veiculo("Civic", "vermelho", 2009); 
        System.out.println(honda.modelo);        
        System.out.println(honda.cor);
        System.out.println(honda.ano);
    }
}

package br.univali.questao1_2;

import br.univali.questao1_2.poo.Veiculo;

public class TestaVeiculo {
    public static void main (String[] args) {
        Veiculo fiat = new Veiculo();
        fiat.setModelo("Uno");
        fiat.setCor("branco");
        fiat.setAno(2010);
        fiat.exibe(fiat.getModelo(), fiat.getCor(), fiat.getAno());
        
        Veiculo honda = new Veiculo();
        honda.setModelo("Civic");
        honda.setCor("vermelho");
        honda.setAno(2009);
        honda.exibe(honda.getModelo(), honda.getCor(), honda.getAno());
    }
}

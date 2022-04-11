
package br.univali.questao2;

public class Main {
    public static void main (String[] args) {
        Maria m = new Maria();
        System.out.println(m.nome);
        System.out.println(m.endereco);
        System.out.println(m.idade);
        System.out.println(m.sexo);
        m.saudacao();
        m.andar();
        m.parar();
    }
}

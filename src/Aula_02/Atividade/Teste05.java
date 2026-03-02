package Aula_02.Atividade;

public class Teste05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("A");

        System.out.println("quantidade de termos repetidos: " + vetor.contarOcorrencias("A"));
    }
}

package Vetor.Atividade;

public class Teste06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(4);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");

        System.out.println("Vetor substituido: " + vetor.substituir("A", "O"));
        System.out.println(vetor);
    }
}

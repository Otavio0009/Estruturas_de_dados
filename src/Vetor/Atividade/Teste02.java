package Vetor.Atividade;

public class Teste02 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");

        System.out.println(vetor.toString());
        System.out.println(vetor.buscar(0));

    }
}

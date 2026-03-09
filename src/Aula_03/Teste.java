package Aula_03;

public class Teste {
    public static void main(String[] args) throws Exception {
        // 01 teste
        // the bag
        Vetor vetor = new Vetor(5);
        int i = 0;

        // 02 teste
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("D");
        vetor.adicionar("E");

        vetor.busca("D");
        vetor.adicionar(2, "C");

        vetor.adicionar("F");
        vetor.adicionar("G");

        vetor.remover(2);
        //System.out.println(vetor.toString());


    }
}

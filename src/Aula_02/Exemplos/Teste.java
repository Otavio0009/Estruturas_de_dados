package Aula_02.Exemplos;

public class Teste {
    public static void main(String[] args) throws Exception {
        // 01 teste
        // the bag

        Vetor vetor= new Vetor(5);

        int i = 0;

        // 02 teste
        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");

        System.out.println(vetor.toString());

        System.out.println(vetor.buscar(-1));
    }

}

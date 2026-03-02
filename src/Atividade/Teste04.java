package Atividade;

public class Teste04 {
    public static void main(String[] args) throws Exception {
        Vetor vetor= new Vetor(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");

        try {
            System.out.println("Tentando pegar o último elemento (vazio):");
            System.out.println(vetor.ultimo());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(vetor.toString());
        System.out.println(vetor.buscar(1));

        vetor.adicionar("E");
        System.out.println(vetor.toString());

        vetor.limpar();
        System.out.println(vetor.toString()); // Saída: 2
    }
}

package Pilha.Aula_01.Atividade;

public class Teste_04 {
    public static void main(String[] args) {
        Pilha<String> p = new Pilha<>(1);

        String entrada = "eu gosto de java";
        String saida = p.inverterFrase(entrada);

        System.out.println("Entrada: " + entrada);
        System.out.println("Saída: " + saida);
    }
}

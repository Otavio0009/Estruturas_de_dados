package Pilha.Aula_01.Atividade;

public class Teste_03 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(10);

        System.out.println(pilha.palindromo("arara"));
        System.out.println(pilha.palindromo("casa"));
    }
}

package Recurcao;

import static Recurcao.Calculadora.*;
import static Recurcao.Atividade.Fibonacci.fibonacci;
import static Recurcao.Atividade.Somatorio.somatorio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fatorial: " + faorialRecursivo(4));
        System.out.println("Fatorial: " + fatorial(5));

        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("Sequencia de fibonacci: " + fibonacci(i));
        }

        System.out.println();

        System.out.println("Somatorio: " + somatorio(5));
    }
}

package Aula_01.PrimeiraAtividade;

public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        int soma  = 0;
        int n = 10;
        int m = 1;

        while (m <= n) {
            soma += m;
            m ++;
        }
        System.out.println(soma);
        int numero = 7;

        for  (int i = 1; i <= 10; i++) {
            System.out.println(i + " * 7 = " + i * numero);
        }

        int[] valores = {3, 8, 12, 5, 7, 10, 14};

        for (int valor : valores) {
            if (valor % 2 == 0) {
                System.out.println(valor + " é par!");
            }
        }
    }
}

package Recurcao;

public class Calculadora {
    public static long faorialRecursivo(int num) {
        if (num < 0) {
            throw new  IllegalArgumentException("Não existe fatorial de número negativo!");
        }

        long resultado = 1;

        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static int fatorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Não existe fatorial de número negativo!");
        }

        if (num == 0) return 1;

        return num * fatorial(num - 1);
    }
}

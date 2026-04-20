package Recurcao.Atividade;

public class Fibonacci {
    public static long fibonacci(int num) {
        if (num <= 1) return num;

        long anterior = 0;
        long atual = 1;

        for (int i = 2; i <= num; i++) {
            long proximoNum = anterior + atual;
            anterior = atual;
            atual = proximoNum;
        }

        return atual;
    }
}

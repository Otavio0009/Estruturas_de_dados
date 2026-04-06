package Fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(10);

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        fila.enfileira(4);
        fila.enfileira(5);

        fila.espiar();

        fila.desenfileira();

        System.out.println(fila.tamanho());
        System.out.println(fila.toString());
    }
}

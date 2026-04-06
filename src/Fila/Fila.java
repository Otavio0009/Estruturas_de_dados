package Fila;
import java.util.Arrays;

public class Fila<T> {
    private T[] elementos;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {return this.tamanho;}

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder conteudo = new StringBuilder();
        conteudo.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            conteudo.append(this.elementos[i]).append(", ");
        }
        conteudo.append(this.elementos[this.tamanho - 1]).append("]");
        return conteudo.toString();
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            // CORREÇÃO: Removido o 'new' extra e ajustado o cast para (T[])
            T[] novoElementos = (T[]) new Object[this.elementos.length * 2];

            for (int i = 0; i < this.tamanho; i++) {
                novoElementos[i] = this.elementos[i];
            }

            this.elementos = novoElementos;
        }
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void enfileira(T elemento) {

        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T espiar() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public  T desenfileira() {

        if (this.estaVazia()) {
            return null;
        }

        T elementoRemovido = this.elementos[0];

        for (int i = 0; i < this.tamanho -1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;

        return elementoRemovido;
    }
}

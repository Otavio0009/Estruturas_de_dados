package Pilha.Aula_01;

import java.util.Arrays;

public class VetorGenerico<T> {

    private T[] elementos;
    private int tamanho;

    public VetorGenerico(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

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

    public void empilhar(T elemento) {
        this.aumentaCapacidade();

        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T desempilhar() {
        if(estaVazia()) {
            return null;
        }

        T elemento = this.elementos[this.tamanho - 1];

        this.elementos[this.tamanho - 1] = null;
        this.tamanho --;

        return elemento;
    }

    public T topo() {
        if (estaVazia()) {
            return null;
        }

        return this.elementos[this.tamanho - 1];

    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }
}
package Pilha;

import java.util.Arrays;

public class Pilha {
    private Object[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Alterado para Object, pois a pilha guarda qualquer objeto
    public Object topo() {
        if (this.estaVazia()) {
            throw new IllegalStateException("A pilha está vazia");
        }
        return this.elementos[this.tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public boolean contem(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public boolean empilhar(Object elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public Object desempilhar() {
        if (this.estaVazia()) {
            return null;
        }
        Object elementoRemovido = this.elementos[tamanho - 1];
        this.elementos[tamanho - 1] = null; // Boa prática para o Garbage Collector
        this.tamanho--;
        return elementoRemovido;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public Object buscar(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder conteudo = new StringBuilder();
        conteudo.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            conteudo.append(this.elementos[i]);
            conteudo.append(", ");
        }

        conteudo.append(this.elementos[this.tamanho - 1]);
        conteudo.append("]");
        return conteudo.toString();
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            // CORREÇÃO: O novo array deve ser de Object, não String
            Object[] novoElementos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novoElementos[i] = this.elementos[i];
            }
            this.elementos = novoElementos;
        }
    }

    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.elementos[tamanho - 1] = null;
        this.tamanho--;
    }
}
package Aula_02.Exemplos;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public String ultimo() {
        if (this.estaVazia()) {
            throw new IllegalStateException("O vetor está vazio");
        }
        return this.elementos[this.tamanho - 1];
    }

    public void imprimeUmPorLinha() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            // .equals evita erros de comparação de memória
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public void adicionar(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new RuntimeException("Vetor cheio!");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    // CORREÇÃO: Lançar erro apenas se a posição for INVÁLIDA
    public String buscar(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    // CORREÇÃO: Tratamento para não dar erro quando o vetor estiver vazio
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
}
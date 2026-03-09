package Aula_03;
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

    public boolean adicionar(String elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;

        }
        return false;
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
    //Sobrescrita
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

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void adicionar(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = tamanho -1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            String[] novoElementos = new String[this.elementos.length * 2];
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

        for (int i = posicao + 1; i < this.tamanho; i++) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[tamanho - 1] = null;
        this.tamanho--;
    }
}
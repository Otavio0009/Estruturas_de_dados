package Pilha.Aula_01.Atividade;

public class Pilha<T> {
    private T[] elementos;
    private int tamanho;

    Pilha(int capacidade) {
        this.tamanho = 0;
        this.elementos = (T[]) new Object[capacidade];
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

    public String inverterPalavra(String palavra) {

        Pilha<Character> pilha = new Pilha<>(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilhar(palavra.charAt(i));
        }

        StringBuilder invertida = new StringBuilder();
        while (!pilha.estaVazia()) {
            invertida.append(pilha.desempilhar());
        }

        return invertida.toString();
    }

    public String palindromo(String palavra) {
        String palavraLimpa = palavra.replace(" ", "").toLowerCase();

        String palavraInvertida = inverterPalavra(palavraLimpa);

        if (palavraLimpa.equals(palavraInvertida)) {

            return palavra + " -> É palíndromo";

        } else {

            return palavra + " -> Não é palíndromo";
        }
    }

    public String inverterFrase(String frase) {
        String[] palavras = frase.split(" ");

        Pilha<String> pilhaPalavras = new Pilha<>(palavras.length);

        for (String palavra : palavras) {
            pilhaPalavras.empilhar(palavra);
        }

        StringBuilder fraseInvertida = new StringBuilder();

        while (!pilhaPalavras.estaVazia()) {
            fraseInvertida.append(pilhaPalavras.desempilhar());

            if (!pilhaPalavras.estaVazia()) {
                fraseInvertida.append(" ");
            }
        }

        return fraseInvertida.toString();
    }
}

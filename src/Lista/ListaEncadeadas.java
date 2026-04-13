package Lista;

public class ListaEncadeadas<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho = 0;
    private final int NAO_ENCONTRADO = -1;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionar(T elemento) {
        No<T> celula = new No<>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.fim.setProximo(celula);
        }

        this.fim = celula;
        this.tamanho++;
    }

    public void limpa() {

        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);

            atual = proximo;
        }

        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        if (this.tamanho == 0) {
            return "[Tamanho= " + this.tamanho + "]";
        }

        No<T> atual = this.inicio;

       /* while (atual.getProximo() != null) {
            atual = atual.getProximo();
            sb.append(atual.getElemento()).append(",");
        } */

        for (int i = 0; i < this.tamanho -1; i++) {
            sb.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }

        sb.append(atual.getElemento());
        sb.append(": Tamanho= ").append(this.tamanho);
        sb.append("]");

        return sb.toString();
    }

    public int buscar(T elemento) {
        No<T> atual = this.inicio;
        int posicao = 0;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return posicao;
            }
            posicao ++;
            atual = atual.getProximo();
        }

        return NAO_ENCONTRADO;
    }

    private No<T> buscaPorNo(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IndexOutOfBoundsException("Posição inválido");
        }

        No<T> atual = this.inicio;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    public T buscarPosicao(int posicao) {
        return this.buscaPorNo(posicao).getElemento();
    }

    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> atual = new No<>(elemento);

            this.inicio = atual;
            this.fim = atual;

        } else {
            No<T> atual = new No<>(elemento);

            atual.setProximo(this.inicio);
            this.inicio =  atual;
        }

        this.tamanho++;
    }

    public void adicionar(T elemento, int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IndexOutOfBoundsException("Posição inválido.");
        }

        if (posicao == 0) {

            this.adicionaInicio(elemento);

        } else if (posicao == this.tamanho) {

            this.adicionar(elemento);

        } else {
            No<T> anterior = this.buscaPorNo(posicao - 1);
            No<T> proximo =  anterior.getProximo();

            No<T> atual = new No<>(elemento, proximo);

            anterior.setProximo(atual);
            this.tamanho++;
        }
    }

    public T removerInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia.");
        }

        T removido = this.inicio.getElemento();

        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0) {
            this.fim = null;
        }

        return removido;
    }

    public T removerFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("A lista está vazia.");
        }

        if (this.tamanho == 1) {
            this.removerInicio();
        }

        No<T> penultimo = this.buscaPorNo(this.tamanho - 2);
        T  removido = penultimo.getProximo().getElemento();

        penultimo.setProximo(null);
        this.fim = penultimo;

        this.tamanho--;
        return removido;
    }

    public T remover(int posicao) throws IllegalAccessException {
        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalAccessException("Posição inválida");
        }

        if  (posicao == 0) {
            this.removerInicio();
        } if (posicao == tamanho - 1) {
            this.removerFinal();
        }

        No<T> aterior = this.buscaPorNo(posicao - 1);
        No<T> atual =  aterior.getProximo();
        No<T> proximo =  atual.getProximo();

        aterior.setProximo(proximo);
        atual.setProximo(null);

        this.tamanho--;
        return atual.getElemento();
    }
}

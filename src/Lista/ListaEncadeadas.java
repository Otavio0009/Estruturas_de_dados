package Lista;

public class ListaEncadeadas<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho = 0;

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
}

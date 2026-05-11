package Mapa;

public class Associacao<K, V> {
    private K chave;
    private V valor;

    public Associacao(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Associacao{");
        sb.append("chave=").append(chave);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}

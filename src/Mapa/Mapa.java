package Mapa;
import Lista.ListaEncadeadas;

public class Mapa<K,V> {
    private ListaEncadeadas<Associacao<K, V>> lista;

    public Mapa() {
        this.lista = new Lista.ListaEncadeadas<>();
    }

    public V inserir(K chave, V valor) {
        for (int i = 0; i < this.lista.getTamanho(); i++) {
            Associacao<K,V> assoc = lista.buscarPosicao(i);

            if (assoc.getChave().equals(chave)) {
                V antigo = assoc.getValor();
                assoc.setValor(valor);
                return antigo;
            }
        }

        lista.adicionar(new Associacao<>(chave, valor));
        return null;
    }

    public V buscar(K chave) {
        for (int i = 0; i < this.lista.getTamanho(); i++) {
            Associacao<K,V> assoc = lista.buscarPosicao(i);

            if (assoc.getChave().equals(chave)) {
                return assoc.getValor();
            }
        }
        return null;
    }

    public V remover(K chave) {
        for (int i = 0; i < this.lista.getTamanho(); i++) {
            Associacao<K, V> assoc = lista.buscarPosicao(i);

            if (assoc.getChave().equals(chave)) {
                this.lista.remover(i);
                return assoc.getValor();
            }
        }

        return null;
    }

    public ListaEncadeadas<K> retornarChaves() {
        ListaEncadeadas<K> todasAsChaves = new ListaEncadeadas<>();

        for (int i = 0; i < this.lista.getTamanho(); i++) {
            todasAsChaves.adicionar(lista.buscarPosicao(i).getChave());
        }

        return todasAsChaves;
    }

    public ListaEncadeadas<V> retornarValores() {
        ListaEncadeadas<V> todosOsValores = new ListaEncadeadas<>();

        for (int i = 0; i < this.lista.getTamanho(); i++) {
            todosOsValores.adicionar(lista.buscarPosicao(i).getValor());
        }

        return todosOsValores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mapa{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}

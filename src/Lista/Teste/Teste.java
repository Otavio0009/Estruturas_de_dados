package Lista.Teste;

import Lista.ListaEncadeadas;

public class Teste {
    public static void main(String[] args) {
        ListaEncadeadas<Integer> lista = new ListaEncadeadas<>();

        lista.adicionar(9);
        lista.adicionar(8);
        lista.adicionar(7);

        System.out.println(lista);

        lista.limpa();
        System.out.println(lista);
    }
}

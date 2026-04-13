package Lista.Teste;

import Lista.ListaEncadeadas;

public class Teste {
    public static void main(String[] args) throws IllegalAccessException {
        ListaEncadeadas<Integer> lista = new ListaEncadeadas<>();

        lista.adicionar(9);
        lista.adicionar(8);
        lista.adicionar(7);
        // lista.adicionaInicio(6);
        lista.adicionar(6, 2);

        System.out.println(lista);

        //lista.limpa();

        System.out.println("Buscando pelo elemento e mostrando o indice: " + lista.buscar(9));
        System.out.println("Buscando pela possição e mostrando o elemento: " + lista.buscarPosicao(2));

        System.out.println();

        ListaEncadeadas<Integer> lista2 = new ListaEncadeadas<>();

        lista2.adicionaInicio(9);
        lista2.adicionaInicio(10);
        lista2.adicionaInicio(11);
        lista2.adicionaInicio(12);
        lista2.adicionaInicio(13);

        // lista2.removerInicio();
        // lista2.removerFinal();
        lista2.remover(2);

        System.out.println(lista2);
    }
}

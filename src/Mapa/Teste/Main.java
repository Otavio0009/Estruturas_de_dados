package Mapa.Teste;
import Mapa.Mapa;

public class Main {
    public static void main(String[] args) {
        Mapa<String, Double> produtos = new Mapa<String, Double>();

        // 1. Testar Inserção
        System.out.println("--- Adicionando Produtos ---");
        produtos.inserir("Teclado", 150.0);
        produtos.inserir("Mouse", 80.0);
        produtos.inserir("Monitor", 900.0);
        System.out.println(produtos);

        // 2. Testar Atualização (Mesma chave, valor diferente)
        System.out.println("--- Atualizando Preço do Mouse ---");
        produtos.inserir("Mouse", 95.0);
        System.out.println("Novo valor do Mouse: " + produtos.buscar("Mouse"));

        // 3. Testar Busca
        System.out.println("--- Buscando Monitor ---");
        System.out.println("Preço: " + produtos.buscar("Monitor"));

        // 4. Testar Listagem de Chaves e Valores
        System.out.println("--- Chaves presentes no Mapa ---");
        System.out.println(produtos.retornarChaves());

        System.out.println("--- Valores presentes no Mapa ---");
        System.out.println(produtos.retornarValores());

        // 5. Testar Remoção
        System.out.println("--- Removendo Teclado ---");
        Double valorRemovido = produtos.remover("Teclado");
        System.out.println("Valor que foi removido: " + valorRemovido);
        System.out.println("Mapa após remoção: " + produtos);

        // 6. Testar Busca de item inexistente
        System.out.println("--- Buscando item que não existe (Fone) ---");
        System.out.println("Resultado: " + produtos.buscar("Fone"));
    }
}

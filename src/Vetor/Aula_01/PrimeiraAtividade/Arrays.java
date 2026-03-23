package Vetor.Aula_01.PrimeiraAtividade;

public class Arrays {
    public static void main(String[] args) {
        int[] valores = {10,20,30,40,50};

        for (int i = 0; i < valores.length; i++) {
            System.out.println (valores[i]);
        }

        System.out.println ("--------------------------");

        for (int valor : valores) {
            System.out.println (valor);
        }

        int[] numeros = {25, 47, 3 , 19, 102, 56};
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);

        double[] nota = {7.5, 8.0, 6.3, 9.2};
        double soma = 0;


        for (double n : nota) {
            soma += n;
        }
        double media = soma / nota.length;
        System.out.println(media);

        String[] nomes = {"Ana", "Bruno", "Clara", "Daniel", "Eduardo"};
        String buscar = "Clara";

        for (String nome : nomes) {
            if (nome ==  buscar) {
                System.out.println("Nome: " + nome);
            }
        }

        int[] lista = {1, 2, 3, 4, 5, 6};

        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }
    }
}

package Aula_02;

public class Aula02 {
    public static void main(String[] args) {
        // Arrays

        /*
         * É uma estrutura de dados que tem algumas caracteristicas espesificas
         * Tamanho fixos
         * Homagênio: Só pode guardar valores de mesmo tipo
         * É acesado atraves do indice
         * E tambem tem o sue tamnho Length
         */

        double temperatura = 39.9;
        double temperatura2 = 38.7;
        double temperatura3 = 37.7;
        double temperatura4 = 39.9;

        double[] temperaturas = new double[5];

        temperaturas[0] = 39.9;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }
    }
}

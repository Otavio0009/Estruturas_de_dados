package Aula_01.PrimeiraAtividade;

public class AtividadeFinal {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 6.8, 9.3, 5.5};
        double soma = 0.0;

        for (double nota : notas){
            System.out.println(nota);

            soma += nota;

            if (nota > 8){
                System.out.println("Esas fram as notas maiores que 8 " + nota);
            }
        }

        double media = soma / notas.length;
        System.out.println(media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

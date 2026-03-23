package Vetor.Aula_01.PrimeiraAtividade;

public class Condicionais {
    public static void main(String[] args) {
        int numero = 37;

        if (numero % 2 == 0) {
            System.out.println("Nuremo par");
        } else {
            System.out.println("Numero impar");
        }

        int idade = 46;

        if (idade < 12){
            System.out.println(idade + " Crianca");
        } else if (idade >= 12 && idade < 18) {
            System.out.println(idade + " Adolecente");
        } else if (idade >= 18 && idade < 50) {
            System.out.println(idade + " Adulto");
        } else {
            System.out.println(idade + " Idoso");
        }
        double nota = 8.3;

        if (nota >= 0.0 && nota < 5.0) {
            System.out.println(nota + " Coceito D");
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println(nota + " Coceito C");
        } else if (nota >= 7.0 && nota < 9.0) {
            System.out.println(nota + " Coceito B");
        } else if (nota >= 9.0 && nota <= 10.0) {
            System.out.println(nota + " Coceito A");
        }

        int dia = 4;

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terca");
        } else if (dia == 4) {
            System.out.println("Quarta");
        }  else if (dia == 5) {
            System.out.println("Quinta");
        }  else if (dia == 6) {
            System.out.println("Sexta");
        }  else if (dia == 7) {
            System.out.println("Sabado");
        }
    }
}
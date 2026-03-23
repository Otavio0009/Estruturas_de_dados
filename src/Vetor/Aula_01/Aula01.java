package Vetor.Aula_01;

public class Aula01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int numero = 9;
        String nome = "Otavio";
        double salario = 1500.00;
        int idade = 16;
        boolean amigoDoDono = true;

        int numero2 = 10;
        int numero3 = 2;

        int divisisaoInteira = numero2 / numero3;
        double divisisaoDouble = divisisaoInteira;
        divisisaoInteira = (int) divisisaoDouble;

        if (idade <= 18) {
            System.out.println("Proibida a entrada");
        } else if (amigoDoDono) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Entrada permitida");
        }
    }
}

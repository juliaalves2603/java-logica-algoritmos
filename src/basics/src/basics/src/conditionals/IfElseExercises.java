package conditionals;

import java.util.Scanner;

public class IfElseExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EX 1: Par ou ímpar
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        // EX 2: Maior de dois números
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Maior = " + a);
        } else if (b > a) {
            System.out.println("Maior = " + b);
        } else {
            System.out.println("Os números são iguais.");
        }

        // EX 3: Classificação de nota
        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}

package functions;

import java.util.Scanner;

public class MethodsExercises {

    public static boolean isPar(int n) {
        return n % 2 == 0;
    }

    public static int maior(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int somaDe1aN(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) soma += i;
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EX 1
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("É par? " + isPar(n));

        // EX 2
        System.out.print("Digite dois números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Maior = " + maior(a, b));

        // EX 3
        System.out.print("Digite N: ");
        int N = sc.nextInt();
        System.out.println("Soma 1..N = " + somaDe1aN(N));

        sc.close();
    }
}

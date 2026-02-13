package loops;

import java.util.Scanner;

public class WhileForExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EX 1: Tabuada (1 a 10)
        System.out.print("Digite um número para ver a tabuada: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // EX 2: Soma de 1 até N
        System.out.print("Digite N: ");
        int N = sc.nextInt();

        int soma = 0;
        int i = 1;
        while (i <= N) {
            soma += i;
            i++;
        }
        System.out.println("Soma de 1 até " + N + " = " + soma);

        // EX 3: Contar quantos números positivos foram digitados (para quando digitar 0)
        int countPositivos = 0;
        int valor;

        do {
            System.out.print("Digite um número (0 para sair): ");
            valor = sc.nextInt();
            if (valor > 0) countPositivos++;
        } while (valor != 0);

        System.out.println("Quantidade de positivos: " + countPositivos);

        sc.close();
    }
}

package basics;

import java.util.Scanner;

public class VariablesAndInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EX 1: Ler nome e idade e imprimir mensagem
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        // EX 2: Ler dois números e mostrar soma
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int soma = a + b;
        System.out.println("Soma = " + soma);

        sc.close();
    }
}

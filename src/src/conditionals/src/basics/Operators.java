package basics;

public class Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y (inteiro) = " + (x / y));
        System.out.println("x % y (resto) = " + (x % y));

        // Comparações
        System.out.println("x > y? " + (x > y));
        System.out.println("x == y? " + (x == y));

        // Operadores lógicos
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + (!a));
    }
}

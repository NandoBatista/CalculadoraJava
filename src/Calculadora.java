import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int operator;
        int again;
        Scanner scan = new Scanner(System.in);

        try {

            do {
                System.out.println("\nDigite qual operação deseja fazer: \n" +
                        "Para somar digite 1 ->\n" +
                        "Para subtrair digite 2 ->\n" +
                        "Para dividir digite 3 ->\n" +
                        "Para multiplicar digite 4 ->\n");

                operator = scan.nextInt();

                if (operator == 1) sum(0, 0);
                else if (operator == 2) minus(0, 0);
                else if (operator == 3) div(0, 0);
                else if (operator == 4) mult(0, 0);
                else System.out.println("Conta inválida");

                System.out.println("\nVocê deseja continuar? \n" +
                        "Caso sim digite 1 ->\n" +
                        "Caso não digite 2 ->\n");
                again = scan.nextInt();
            }
            while (again != 2);
            System.out.println("Programa finalizado!");
        } catch (Exception e) {
            System.out.println("Erro de exceção!");
        }
    }

    static void sum(int x, int y) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        x = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        y = scan.nextInt();
        System.out.println("O resultado é = " + (x + y));
    }

    static void minus(int x, int y) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        x = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        y = scan.nextInt();
        System.out.println("O resultado é = " + (x - y));
    }

    static void div(int x, int y) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        x = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        y = scan.nextInt();
        System.out.println("O resultado é = " + (x / y));
    }

    static void mult(int x, int y) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        x = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        y = scan.nextInt();
        System.out.println("O resultado é = " + (x * y));
    }
}



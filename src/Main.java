import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double resultado = 0;
        boolean salir = false;

        while (!salir) {
            try {
                System.out.print("Ingresa el primer número: ");
                double num1 = sc.nextDouble();

                System.out.print("Ingresa el operador (+, -, *, /): ");
                char operador = sc.next().charAt(0);

                System.out.print("Ingresa el segundo número a operar: ");
                double num2 = sc.nextDouble();

                if (operador == '+') {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                } else if (operador == '-') {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                } else if (operador == '*') {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                } else if (operador == '/') {
                    if (num2 == 0) {
                        System.out.println("Error: División entre 0");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    }
                } else {
                    System.out.println("Operador no válido.");
                }


                System.out.print("¿Deseas salir? (s/n): ");
                char respuesta = sc.next().charAt(0);
                if (respuesta == 's' || respuesta == 'S') {
                    salir = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida.");
                sc.nextLine();
            }
        }

        sc.close();
        System.out.println("Programa finalizado.");
    }
}

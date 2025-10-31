import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double resultado = 0;

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
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Error: no se puede dividir entre cero.");
            }
        } else {
            System.out.println("Operador no válido.");
        }

        sc.close();
    }
}

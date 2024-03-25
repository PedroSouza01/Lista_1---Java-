
/* Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo deoperador em outra variável do tipo CARACTERE. Imprima o resultado da operação
de A por B se o operador aritmético for válido; caso contrário deve ser impresso umamensagem de operador não definido. Tratar erro de divisão por zero. */
import java.util.Scanner;

public class Ex13 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o Operdaor desejado (+, -, * ou /): ");
        char operador = scan.next().charAt(0);

        if (operador == '+') {
            int resultado = num1 + num2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador == '-') {
            int resultado = num1 - num2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador == '*') {
            int resultado = num1 * num2;
            System.out.println("O resultado é: " + resultado);
        } else if (operador == '/') {
            int resultado = num1 / num2;
            System.out.println("O resultado é: " + resultado);
        } else {
            System.out.println("!!ERRO!!");
        }

        scan.close();

    }
}

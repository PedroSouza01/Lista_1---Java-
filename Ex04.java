
/*Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos. */
import java.util.Scanner;

public class Ex04 {

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public static int divisao(int num1, int num2) {
        return num1 / num2;
    }

    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("A soma é: " + soma(num1, num2));
        System.out.println("A subtração é: " + subtracao(num1, num2));
        System.out.println("A multiplicação é: " + multiplicacao(num1, num2));
        System.out.println("A divisão é: " + divisao(num1, num2));

        scan.close();

    }
}

/*Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma. */
import java.util.Scanner;

public class Ex02 {
    public static void executar() {
        System.out.println("Digite o primeiro número: ");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o segundo número: ");
        int num1 = scan.nextInt();

        int num2 = scan.nextInt();

        int resultado = num1 + num2;

        System.out.println("O resultado da soma é: " + resultado);

        scan.close();
    }
}

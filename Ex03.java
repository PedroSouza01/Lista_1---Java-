
/* Escreva um algoritmo que leia os valores de dois números inteiros distintos nasvariáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida. */
import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();

        if (a > b) {
            System.out.println("O número " + a + " é maior que " + b);
        } else if (a < b) {
            System.out.println("O número " + a + " é menor que " + b);
        } else {
            System.out.println("Número Ínvalido");
        }
        scan.close();
    }
}
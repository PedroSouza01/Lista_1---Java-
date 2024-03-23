
/* Leia dois números nas variáveis A e B e identifique se os valores são iguais oudiferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.Caso sejam diferentes, informe que são diferentes e qual número é o maior. */
import java.util.Scanner;

public class Ex09 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scan.nextInt();

        if (a != b && a > b) {
            System.out.println("Os números são Diferentes e o número " + a + " é o número maior!");
        } else if (a != b && a < b) {
            System.out.println("Os números são Diferentes e o número " + b + " é o número maior!");
        } else {
            System.out.println("Os números são Iguais!!");
        }

        scan.close();
    }
}


/* Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente */
import java.util.Scanner;
import java.util.Arrays;

public class Ex11 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[3];

        System.out.println("digite 3 numeros para ordenar: ");
        for (int i = 0; i < 3; i++) {
            vet[i] = scan.nextInt();
        }

        Arrays.sort(vet);

        for (int num : vet) {
            System.out.println(num);
        }

        scan.close();
    }
}

/*
 * System.out.println("Digite o primeiro número: ");
 * int num1 = scan.nextInt();
 * 
 * System.out.println("Digite o segundo número: ");
 * int num2 = scan.nextInt();
 * 
 * System.out.println("Digite o terceiro número: ");
 * int num3 = scan.nextInt();
 */

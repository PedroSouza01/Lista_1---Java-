/* Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaa ritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83 */

import java.util.Scanner;

public class Ex16 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float num1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float num2 = scan.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float num3 = scan.nextFloat();

        float resultado = (num1 + num2 + num3) / 3;

        System.out.println("A média do aluno é: " + resultado);

        scan.close();
    }
}

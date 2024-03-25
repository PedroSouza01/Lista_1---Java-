/*  Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica */

import java.util.Scanner;

public class Ex18 {

    public static Float calculo(float nota1, float nota2, float nota3) {
        return 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
    }

    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        float nota1 = scan.nextFloat();

        System.out.println("Digite a segunda nota do aluno: ");
        float nota2 = scan.nextFloat();

        System.out.println("Digite a terceira nota do aluno: ");
        float nota3 = scan.nextFloat();

        System.out.println("O resultado é: " + calculo(nota1, nota2, nota3));

        scan.close();
    }
}

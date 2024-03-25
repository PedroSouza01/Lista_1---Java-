/* Elabore um algoritmo que receba três notas de um aluno os pesos referentes acada nota e retorne a sua média ponderada.*/

import java.util.Scanner;

public class Ex17 {

    public static Float calculo(float nota1, float peso1, float nota2, float peso2, float nota3, float peso3) {
        return nota1 * peso1 + nota2 * peso2 + nota3 * peso3 / peso1 + peso2 + peso3;
    }

    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1 e o Peso 1 do aluno: ");
        float nota1 = scan.nextFloat();
        float peso1 = scan.nextFloat();

        System.out.println("Digite a nota 2 e o Peso 2 do aluno: ");
        float nota2 = scan.nextFloat();
        float peso2 = scan.nextFloat();

        System.out.println("Digite a nota 3 e o Peso 3 do aluno: ");
        float nota3 = scan.nextFloat();
        float peso3 = scan.nextFloat();

        System.out.println("A média ponderada é: " + calculo(nota1, peso1, nota2, peso2, nota3, peso3));

        scan.close();
    }
}

/* A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28 */

import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor (a1) para o resultado da expressão An: ");
        int a1 = scan.nextInt();

        System.out.println("Digite o valor (r) para o resultado da expressão An: ");
        int r = scan.nextInt();

        System.out.println("Digite o valor (n) para o resultado da expressão An: ");
        int n = scan.nextInt();

        int resultado = a1 + (n - 1) * r;

        System.out.println("O resultado do calculo é: " + resultado);

        scan.close();

    }
}

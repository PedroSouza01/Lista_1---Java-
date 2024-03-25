/* Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03 */

import java.util.Scanner;

public class Ex15 {
    public static void executar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os pontos (x1 - x2): ");
        double x1 = scan.nextDouble();
        double x2 = scan.nextDouble();

        System.out.println("Digite os pontos (y1 - y2): ");
        double y1 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("O resultado é: " + d);

        scan.close();
    }
}

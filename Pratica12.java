/* Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal
  usando a seguinte fórmula: (72.7*altura) - 58 */

import java.util.Scanner;

public class Pratica12 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite sua altura: ");
        
            double altura = input.nextDouble();
            double pesoideal = (72.7 * altura) - 58;

            System.out.printf("O seu peso ideal é: %.5s%n", pesoideal);

        }
    }
}

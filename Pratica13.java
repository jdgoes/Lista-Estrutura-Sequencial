/* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
utilizando as seguintes fórmulas:
a. Para homens: (72.7*h) - 58
b. Para mulheres: (62.1*m) - 44.7 */


import java.util.Scanner;

public class Pratica13 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){

            System.out.print("Digite sua altura: ");

            double altura = input.nextDouble();
            double pesoideal = (72.7 * altura) - 58;
            double pesoideal2 = (62.1 * altura) - 44.7;

            System.out.printf("Se você for homem o seu peso ideal é: %.5s%n", pesoideal);
            System.out.printf("Se você for mulher o seu peso ideal é: %.5s%n", pesoideal2);

        }
    }
}

/* Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
A. o produto do dobro do primeiro com metade do segundo .
B. a soma do triplo do primeiro com o terceiro.
C. o terceiro elevado ao cubo. */


import java.util.Scanner;

public class Pratica11 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){

        System.out.print("Digite um valor inteiro: ");
        int n1 = input.nextInt();
        
        System.out.print("Digite um outro valor inteiro: ");
        int n2 = input.nextInt();

        System.out.print("Digite um valor em números reais: ");
        double n3 = input.nextDouble();

        double valorA = (n1 * 2) * (n2 / 2);
        double valorB = n1 * 3 + n3;
        double valorC = n3 * n3 * n3;

        System.out.printf("%nO produto do dobro do primeiro com metade do segundo é: %.2f %n", valorA);
        System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f %n", valorB);
        System.out.printf("O terceiro elevado ao cubo é: %.2f %n", valorC);



        }
    }
}

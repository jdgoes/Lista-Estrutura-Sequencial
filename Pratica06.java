//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.


import java.util.Scanner;

public class Pratica06 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){
        
        System.out.print("Digite o valor do raio para obter o resultado do tamanho da área:  ");
            Double raio = input.nextDouble();
            Double area = 3.14 * (raio * raio);

            System.out.printf("O tamanho da área é: %.2f %n", area);
        }
    }
}

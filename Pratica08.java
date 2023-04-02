//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Pratica08 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Quanto você ganha por hora? ");
            Double x = input.nextDouble();

            System.out.print("Ok, quantas horas você trabalha por mês? ");
            Double y = input.nextDouble();

            Double salario = x * y;

            System.out.printf("O seu ganho neste mês será de R$ %.2f ", salario);

        }        
    }
}
// Caso tiver problemas pra executar os exercícios, alterar para externalTerminal. 
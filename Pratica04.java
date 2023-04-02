//Faça um Programa que peça as 4 notas bimestrais e mostre a média.


import java.util.Scanner;

public class Pratica04 {
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite a nota do aluno A1: ");
            Double nota1 = input.nextDouble();

            System.out.print("Digite a nota do aluno A2: ");
            Double nota2 = input.nextDouble();

            System.out.print("Digite a nota do aluno A3: ");
            Double nota3 = input.nextDouble();

            System.out.print("Digite a nota do aluno A4: ");
            Double nota4 = input.nextDouble();

            Double nota5 = nota1 + nota2 + nota3 + nota4;
            Double nota6 = (nota1 + nota2 + nota3 + nota4) / 4;
            
            System.out.printf("A soma dessas notas é igual a %.1f %n", nota5);
            System.out.printf("A média dessas notas é igual a %.1f %n", nota6);
        }
    }
}
// Caso tiver problemas pra executar os exercícios, alterar para externalTerminal. 
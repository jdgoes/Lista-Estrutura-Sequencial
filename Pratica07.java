//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário


import java.util.Scanner;

public class Pratica07 {
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite o valor do comprimento de um dos lados do quadrado: ");
            Double comprimento = input.nextDouble();
            Double area = (comprimento * comprimento) * 2;
            
            System.out.printf("O dobro da área do quadrado é: %.2f %n", area);
        }
       
    }

}

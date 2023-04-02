//Faça um Programa que peça dois números e imprima a soma.


import java.util.Scanner;

public class Pratica03 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){

            System.out.print("Digite um valor: ");
            int x = input.nextInt();

            System.out.print("Digite um outro valor: ");
            int y = input.nextInt();

            System.out.printf("A soma desses valores é: %d%n", x + y);
        }
               
    }

}

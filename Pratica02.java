//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].


import java.util.Scanner;

public class Pratica02 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){ 
            
            int x;

            System.out.print("Digite um valor: ");
            x = input.nextInt();
            
        
        System.out.printf("O valor digitado é: %d%n", x); 
        
    }

    }
}
// Caso tiver problemas pra executar os exercícios, alterar para externalTerminal. 
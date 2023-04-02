//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius


import java.util.Scanner;

public class Pratica09 {
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite um valor em °F: ");
            Double x = input.nextDouble();
            
            Double y = (x - 32) / 1.8;
            
            System.out.printf("A temperatura em %s°F convertida para celsius é %.4s°C %n", x, y);
        }
    }
}

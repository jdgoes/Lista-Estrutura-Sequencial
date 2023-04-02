/* Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. */


import java.util.Scanner;

public class Pratica10{

public static void main(String[] args) {

    try(Scanner input = new Scanner(System.in)){

        System.out.print("Digite a temperatura em celsius:  ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("A temperatura em celsius é %.1f°C, convertida para fahrenheit é: %.1f°F%n", celsius, fahrenheit);
        
        }
        
    }
    
}

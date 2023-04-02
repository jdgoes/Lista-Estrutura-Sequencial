//Faça um Programa que converta metros para centímetros.


import java.util.Scanner;

public class Pratica05 { 
public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
        System.out.printf("Digite um valor em metros: ");
        
        Double metros = input.nextDouble();
        Double centimetros = metros * 100;

        System.out.printf("%s é o valor digitado em metros, equivalente a %.2f centimetros%n", metros, centimetros );

            }

         }

    }

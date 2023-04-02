/* Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. 
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias. */

import java.util.Scanner;

public class Pratica17 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){

        System.out.print("Digite o valor em metros quadrados da área a ser pintada: ");

        double area = input.nextDouble();
        double tintaNecessaria = area * 1.1 / 6;
        
        double latasDeTinta = (int) Math.ceil(tintaNecessaria / 18);
        double galoesDeTinta = (int) Math.ceil(tintaNecessaria / 3.6);

        double misturaLatas = (int) Math.floor(tintaNecessaria / 18);
        double misturaGaloes = (int) Math.ceil((tintaNecessaria - misturaLatas * 18) / 3.6);

        double preco1 = latasDeTinta * 80;
        double preco2 = galoesDeTinta * 25;
        double preco3 = (misturaLatas * 80) + (misturaGaloes * 25);
        
        System.out.printf("%nSerá necessário %.2f litros de tinta. %n%n", tintaNecessaria);
        System.out.printf("Você pode comprar %.2f latas de tinta, que totaliza R$ %.2f %n%n", latasDeTinta, preco1);
        System.out.printf("Se preferir, pode comprar somente galões de tinta, será %.2f galões totalizando  R$ %.2f %n%n", galoesDeTinta, preco2);
        System.out.printf("Ou pode misturar também, %.2f latas e %.2f galões, essa mistura custurá R$ %.2f %n", misturaLatas, misturaGaloes, preco3);


        }
    }
    
}

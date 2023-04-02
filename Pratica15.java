/* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo */


import java.util.Scanner;

public class Pratica15 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Quanto você ganha por hora? ");
            Double valorHora = input.nextDouble();

            System.out.print("Ok, quantas horas você trabalha por mês? ");
            Double horaMes = input.nextDouble();

            Double salarioBruto = valorHora * horaMes;
            Double impostoDeRenda = 11.0, inss = 8.0, sindicato = 5.0, salarioLiquido;

            Double valor1 = (salarioBruto * impostoDeRenda) / 100;
            Double valor2 = (salarioBruto * inss) / 100;
            Double valor3 = (salarioBruto * sindicato) / 100;
            salarioLiquido = salarioBruto - (valor1 + valor2 + valor3);

            System.out.printf("O seu salario bruto é: R$ %.2f %n%n", salarioBruto);

            System.out.printf("Desconto do INSS(8%%): R$ %.2f %n", valor2);
            System.out.printf("Desconto do Sindicato(5%%): R$ %.2f %n", valor3);
            System.out.printf("Desconto do Imposto de Renda(11%%): R$ %.2f%n%n", valor1);

            System.out.printf("Salário Líquido: R$ %.2f %n", salarioLiquido);
        }        
    }
}

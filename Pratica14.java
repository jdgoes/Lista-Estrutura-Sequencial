/* João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do
estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. 
Imprima os dados do programa com as mensagens adequadas. */


import java.util.Scanner;


public class Pratica14 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite o valor correspondente ao peso dos peixes: ");

            double pesodopeixe = input.nextDouble();
            double limite = 50.0;

            double excesso, multa;

            if(pesodopeixe > limite) {
                excesso = pesodopeixe - limite;
                multa = excesso * 4.0;
            }

            else { 
                excesso = 0.0;
                multa = 0.0;  
            }


            if(excesso > 0){         

            System.out.printf("O excesso de peso é %.2f kg, então você deverá pagar R$ %.2f de multa. %n", excesso, multa);

            }
            else{

                System.out.print("Não houve excesso de peso amigão, fique de boa. \n"); 

            }



        }

    }
    
}

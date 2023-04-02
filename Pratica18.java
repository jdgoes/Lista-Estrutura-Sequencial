import java.util.Scanner;

public class Pratica18 {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){

            System.out.print("Digite o tamanho do arquivo em MegaByte (MB):  ");
            double arquivoMb = input.nextDouble();

            System.out.print("Digite a velocidade do link da internet em MegaBits (Mbps):  ");
            double velocidadeMbps = input.nextDouble();

            double valorConvertido = arquivoMb * 8;
            double tempoRestanteSegundos = valorConvertido / velocidadeMbps;
            double tempoRestanteMinutos = tempoRestanteSegundos / 60;

            System.out.printf("O tempo aproximado do seu download é %.2f minutos. ", tempoRestanteMinutos);

        }
    }
}

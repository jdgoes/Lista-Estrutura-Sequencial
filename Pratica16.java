import java.util.Scanner;

public class Pratica16 {
public static void main(String[] args) {
    
    try(Scanner input = new Scanner(System.in)) {

        System.out.print("Qual o tamanho da área a ser pintada? ");
        Double area = input.nextDouble();
        Double mq2 = area / 3.0;

        double necessario = (int) Math.ceil(mq2 / 18.0);
        double valortotal = necessario * 80;

        System.out.printf("Serão necessárias %.1f latas de tinta para pintar %s metros quadrados %n", necessario, area);
        System.out.printf("Totalizando então R$ %.2f %n", valortotal);

        
    }
}    
}
// Caso tiver problemas pra executar os exercícios, alterar para externalTerminal. 
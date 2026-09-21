
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int dist;
        double totalg, kml;
        
        //entrada de dados
        dist = leia.nextInt();
        totalg = leia.nextDouble();
        
        //processamento
        kml = dist / totalg;
        
        //saida de dados
        System.out.printf("%.3f km/l\n",kml);
    }
}

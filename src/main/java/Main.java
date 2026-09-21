
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int dist;
        double totalg, kml;
        
        dist = leia.nextInt();
        totalg = leia.nextDouble();
        
        kml = dist / totalg;
        
        System.out.printf("%.3f km/l\n",kml);
    }
}

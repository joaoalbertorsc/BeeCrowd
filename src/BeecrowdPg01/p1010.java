package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1010 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.00");
        Scanner s = new Scanner(System.in);
        int codeP1 = s.nextInt();
        int numUnitsP1 = s.nextInt();
        double priceP1 = s.nextDouble();
        int codeP2 = s.nextInt();
        int numUnitsP2 = s.nextInt();
        double priceP2 = s.nextDouble();

        double finalPrice = (numUnitsP1 * priceP1) + (numUnitsP2 * priceP2);
        String fp = df.format(finalPrice);

        System.out.println("VALOR A PAGAR: R$ " + fp);

    }
}

package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1005 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();

        double a = A * 3.5;
        double b = B * 7.5;
        double av = (a + b) / 11;

        DecimalFormat df = new DecimalFormat("#0.00000");
        String AV = df.format(av);

        System.out.println("MEDIA = " + AV);

    }
}

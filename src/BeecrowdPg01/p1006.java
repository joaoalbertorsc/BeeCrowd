package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1006 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        double a = A * 2;
        double b = B * 3;
        double c = C * 5;
        double AV = (a + b + c)/10;

        DecimalFormat decimalFormat = new DecimalFormat("#0.0");
        String av = decimalFormat.format(AV);

        System.out.println("MEDIA = " + av);

    }
}

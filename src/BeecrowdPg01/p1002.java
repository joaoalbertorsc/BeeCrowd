package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1002 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        double n = 3.14159;
        double R = s.nextDouble();

        double A = (n * (R * R));

        String B = df.format(A);
        System.out.println("A=" + B);
    }
}

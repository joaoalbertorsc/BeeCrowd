package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1011 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        double R = s.nextDouble();
        double pi = 3.14159;
        double volume = (((4/3.0) * pi) * (R*R*R));
        String v = df.format(volume);
        System.out.println("VOLUME = " + v);

    }
}

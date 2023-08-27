package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1012 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        double A = s.nextDouble(); // base
        double B = s.nextDouble();
        double C = s.nextDouble(); // height

        double pi = 3.14159;
        double triangle = (A * C) / 2;
        double cicle = (C*C) * pi;
        double trapezium  = ((A + B) * C) / 2;
        double square = B * B;
        double rectangle = A * B;

        String tri = df.format(triangle);
        String cir = df.format(cicle);
        String tra = df.format(trapezium);
        String squ = df.format(square);
        String rec = df.format(rectangle);

        System.out.println(
            "TRIANGULO: " + tri +
            "\nCIRCULO: " + cir +
            "\nTRAPEZIO: " + tra +
            "\nQUADRADO: " + squ +
            "\nRETANGULO: " + rec
        );

    }
}

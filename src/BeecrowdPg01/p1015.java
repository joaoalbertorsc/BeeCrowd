package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1015 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        DecimalFormat df = new DecimalFormat("0.0000");
        double distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        String d = df.format(distance);
        System.out.println(d);

    }
}

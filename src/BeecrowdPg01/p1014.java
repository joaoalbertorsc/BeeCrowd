package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1014 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        double Y = s.nextDouble();

        double avarage = X / Y;
        DecimalFormat df = new DecimalFormat("0.000");
        String av = df.format(avarage);
        System.out.println(av + " km/l");

    }
}

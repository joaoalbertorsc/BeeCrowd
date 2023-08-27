package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1017 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double autonomy = 12.0;
        int timeOnTrip = s.nextInt();
        int averageSpeed = s.nextInt();

        DecimalFormat df = new DecimalFormat("0.000");

        double totalFuel = (timeOnTrip * averageSpeed) / autonomy;
        String tFuel = df.format(totalFuel);

        System.out.println(tFuel);

    }
}

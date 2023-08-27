package BeecrowdPg01;

import java.util.Scanner;

public class p1019 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int minutes = n / 60;
        int hours = minutes / 60;
        int secs = n - minutes * 60;
        int m = n/60 - hours*60;

        System.out.println(hours + ":" + m + ":" + secs);

    }
}

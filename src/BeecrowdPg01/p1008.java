package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1008 {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        Scanner scanner = new Scanner(System.in);
        int employeesNum = scanner.nextInt();
        int workedHoursMonth = scanner.nextInt();
        double amountPerHour = scanner.nextDouble();
        double amoutPerMonth = (workedHoursMonth * amountPerHour);
        String apm = decimalFormat.format(amoutPerMonth);

        System.out.println("NUMBER = " + employeesNum + "\nSALARY = U$ " + apm);

    }
}

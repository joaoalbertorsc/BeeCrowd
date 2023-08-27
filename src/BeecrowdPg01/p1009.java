package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1009 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.00");
        Scanner s = new Scanner(System.in);
        String sellersName = s.nextLine();
        double fixedSalary = s.nextDouble();
        double salesMadeInMonth = s.nextDouble();
        double totalSalary = fixedSalary + (salesMadeInMonth * 0.15);
        String ts = df.format(totalSalary);
        System.out.println("TOTAL = R$ " + ts);

    }
}

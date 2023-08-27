package BeecrowdPg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p1036 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double A, B, C;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        double discriminant = B * B - 4 * A * C;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00000");

        if (A != 0.0 && B != 0.0 && C != 0.0 && discriminant > 0) {
            double root1 = (-B + Math.sqrt(discriminant)) / (2 * A);
            double root2 = (-B - Math.sqrt(discriminant)) / (2 * A);

            String R1 = decimalFormat.format(root1);
            String R2 = decimalFormat.format(root2);

            String roots = String.format("R1 = %s\nR2 = %s", R1, R2);
            System.out.println(roots);

        } else {
            System.out.println("Impossivel calcular");
        }

        scanner.close();
    }
}

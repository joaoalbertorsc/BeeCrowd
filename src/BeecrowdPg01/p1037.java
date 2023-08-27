package BeecrowdPg01;

import java.util.Scanner;

public class p1037 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        if (num < 0 || num > 100){
            System.out.println("Fora de intervalo");
        }
        if (num >= 0 && num <= 25){
            System.out.println("Intervalo [0,25]");
        }
        if (num > 25 && num <= 50){
            System.out.println("Intervalo (25,50]");
        }
        if (num > 50 && num <= 75){
            System.out.println("Intervalo (50,75]");
        }
        if (num > 75 && num <= 100){
            System.out.println("Intervalo (75,100]");
        }
    }
}

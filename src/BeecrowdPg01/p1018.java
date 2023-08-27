package BeecrowdPg01;

import java.util.Scanner;

public class p1018 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N < 0 || N > 1000000){
            System.out.println("Num Error, Plss ReRun.");
        } else {
            System.out.println(N);
        }

        int nota100 = N/100;
        N = N - (nota100 * 100);
        int nota50 = N/50;
        N = N - nota50 * 50;
        int nota20 = N/20;
        N = N - nota20 * 20;
        int nota10 = N/10;
        N = N - nota10 * 10;
        int nota5 = N/5;
        N = N - nota5 * 5;
        int nota2 = N/2;
        N = N - nota2 * 2;
        int nota1 = N/1;


        System.out.println(nota100 + " nota(s) de R$ 100,00\n" +
                nota50 + " nota(s) de R$ 50,00\n" +
                nota20 + " nota(s) de R$ 20,00\n" +
                nota10 + " nota(s) de R$ 10,00\n" +
                nota5 + " nota(s) de R$ 5,00\n" +
                nota2 + " nota(s) de R$ 2,00\n" +
                nota1 + " nota(s) de R$ 1,00");
    }
}

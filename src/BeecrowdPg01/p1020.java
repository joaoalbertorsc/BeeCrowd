package BeecrowdPg01;

import java.util.Scanner;

public class p1020 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        int anos = i/365;
        int meses = (i - 365*anos)/30;
        int dias = i - 30*meses - 365*anos;

        System.out.println(anos + " ano(s)\n" +
                meses + " mes(es)\n" +
                dias + " dia(s)");

    }
}

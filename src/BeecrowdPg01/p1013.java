package BeecrowdPg01;

import java.util.Scanner;

public class p1013 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = maior(s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println(m + " eh o maior");

    }

    public static int maior(int A, int B, int C){

        if (A != B && A != C){
            if (A > B && A > C){
                return A;
            }
        }
        if (A == B && A == C){
            return A;
        }
        if (A == B && A > C){
            return A;
        }
        if (A == C && A > B){
            return A;
        }
        if (B != A && B != C){
            if (B > A && B > C){
                return B;
            }
        }
        if (B == C){
            return B;
        }
        if (B == C && B > A ) {
            return B;
        }
        else {
            return C;
        }

    }

}

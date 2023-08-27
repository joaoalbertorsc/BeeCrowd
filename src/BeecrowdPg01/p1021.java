package BeecrowdPg01;

import java.util.Scanner;

public class p1021 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double valorEntrada = s.nextDouble();

        if (valorEntrada >= 0 && valorEntrada <= 1000000.00){

            double[] notas = new double[6];
            notas[0] = 100.0;
            notas[1] = 50.0;
            notas[2] = 20.0;
            notas[3] = 10.0;
            notas[4] = 5.0;
            notas[5] = 2.0;

            double[] moedas = new double[6];
            moedas[0] = 1.00;
            moedas[1] = 0.50;
            moedas[2] = 0.25;
            moedas[3] = 0.10;
            moedas[4] = 0.05;
            moedas[5] = 0.01;

            int[] numNotas = new int[6];
            int[] numMoedas = new int[6];
            double fator = Math.pow(10, 2);

            int notas100, notas50, notas20, notas10, notas5, notas2;
            int moedas1, moedas50, moedas25, moedas10, moedas5, moedas01;

            for (int i = 0; i < 6; i++) {
                numNotas[i] = (int) (valorEntrada / notas[i]);
                valorEntrada = Math.round((valorEntrada % notas[i]) * fator) / fator;
            }

            for (int i = 0; i < 6; i++) {
                numMoedas[i] = (int) (valorEntrada / moedas[i]);
                valorEntrada = Math.round((valorEntrada % moedas[i]) * fator) / fator;
            }

            notas100 = numNotas[0];
            notas50 = numNotas[1];
            notas20 = numNotas[2];
            notas10 = numNotas[3];
            notas5 = numNotas[4];
            notas2 = numNotas[5];

            moedas1 = numMoedas[0];
            moedas50 = numMoedas[1];
            moedas25 = numMoedas[2];
            moedas10 = numMoedas[3];
            moedas5 = numMoedas[4];
            moedas01 = numMoedas[5];

            String resultado = String.format("""
                    NOTAS:
                    %d nota(s) de R$ 100.00
                    %d nota(s) de R$ 50.00
                    %d nota(s) de R$ 20.00
                    %d nota(s) de R$ 10.00
                    %d nota(s) de R$ 5.00
                    %d nota(s) de R$ 2.00
                    MOEDAS:
                    %d moeda(s) de R$ 1.00
                    %d moeda(s) de R$ 0.50
                    %d moeda(s) de R$ 0.25
                    %d moeda(s) de R$ 0.10
                    %d moeda(s) de R$ 0.05
                    %d moeda(s) de R$ 0.01""", notas100, notas50, notas20, notas10, notas5, notas2, moedas1, moedas50, moedas25, moedas10, moedas5, moedas01);

            System.out.println(resultado);

        } else {
            System.out.println("Numero invalido");
        }
    }
}

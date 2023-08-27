import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Continue {
    public static void main(String[] args) throws InterruptedException {

        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Alice", 25);
        mapa.put("Bob", 30);
        mapa.put("Charlie", 28);

        int idadeBob = mapa.get("Bob");
        System.out.println("A idade de Bob é: " + idadeBob);

        mapa.remove("Alice");

        System.out.println("Tamanho do mapa: " + mapa.size());

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }
        System.out.println();

        Random r = new Random();
        DecimalFormat df = new DecimalFormat("000");
        int[][] matriz = new int[r.nextInt(10)][r.nextInt(10)];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = r.nextInt(999);
                Thread.sleep(100);
                System.out.print("["+ df.format(matriz[i][j]) +"]");
            }
            System.out.println("");
        }
        System.out.println("Essa eh uma matriz " + matriz.length + " por " + matriz[0].length);


        HashMap<Integer, String> hm = new HashMap<>();
        hm.put( 2, "Maria" );
        hm.put( 7, "Pedro" );
        hm.put( 5, "Madalena" );
        String s = hm.get(7);
        System.out.println( s );
    }
}

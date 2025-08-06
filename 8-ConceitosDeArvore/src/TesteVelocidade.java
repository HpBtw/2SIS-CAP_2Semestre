import java.util.ArrayList;

public class TesteVelocidade {
    public static void testar() {

        final int N = 100;
        long t0 = System.currentTimeMillis();
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Iniciando operação...");
        for (int i = 0; i < N; i++)
            lista.add(i);
        long t1 = System.currentTimeMillis();
        System.out.println("Tempo: " + (t1 - t0) + "ms");
//
//        for(int num : lista)
//            System.out.print(num + " ");
    }
}

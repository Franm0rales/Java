import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneradorBoletoSimple {
    private static final int MIN = 1;
    private static final int MAX = 50;
    private static final int NUMS = 5;

    public static int[] generaBoleto() {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < NUMS; i++) {
            int num = generaNumero();
            while (numeros.contains(num)) {
                num = generaNumero();
            }
            numeros.add(num);
        }
        Collections.sort(numeros);
        return numeros.stream().mapToInt(i -> i).toArray();

    }

    private static int generaNumero() {
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int[] boleto = generaBoleto();
            System.out.println(Arrays.toString(boleto));

        }
    }
}

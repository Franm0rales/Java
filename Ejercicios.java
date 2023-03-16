
public class Ejercicios {
    public static void main(String[] args) {

        // Supongamos que un cubo rectangular tiene las dimensiones: largo=15,
        // ancho=23,alto=12. Obtén su volumen.

        int l = 15;
        int a = 23;
        int al = 12;
        int volumen = l * a * al;
        System.out.println(String.format("El volumen es %d", volumen));

        // Obtén la energía cinética si la masa es m = 12 kg y la velocidad es v = 3
        // m/s,
        // imprime el resultado con solo 2 decimales, la fórmula de la energía cinética
        // es

        int m = 12;
        int v = 3;

        double ec = (m * Math.pow(v, 2)) / 2.0;
        System.out.println(String.format("La ec es: %.2f", ec));

    }
}

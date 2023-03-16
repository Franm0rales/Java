import java.util.Scanner;;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("Escribe el numero de episodio que quieras saber su duracion: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int episodeIndex = scanner.nextInt();
            episodeIndex--;

            int[] epidosodeDurationArray = new int[] { 30, 32, 27, 31, 60, 33, 21, 43, 54, 56, 87 };
            int n = epidosodeDurationArray.length;

            if (episodeIndex >= 0 && episodeIndex < n) {
                int epidosodeDuration = epidosodeDurationArray[episodeIndex];
                System.out.println("El resultado de la position es: " + epidosodeDuration + " minutos");

            } else {
                System.out.println("Error, la serie solo tiene " + n + " episodios ");
            }
            int seasonDuration = 0;
            // ForEach
            for (int value : epidosodeDurationArray) {
                seasonDuration += value;

            }
            System.out.println(seasonDuration);
        }
    }
}

public class Cinebox {
    public static void main(String[] args) {
        int totalEpisod = 15;
        int totalsession = 4;
        if (totalEpisod > 1 || totalsession > 1) {

            if (totalsession >= 10) {
                System.out.println("Es una miniserie");
            } else {
                System.out.println("Es una serie");
            }
        } else if (totalEpisod == 1) {
            System.out.println("Es una pelicula");
        } else {

            System.out.println("Debe tener al menos un episodio");
        }

        int i = 0;
        int duration = 10;
        while (i <= duration) {
            if (i < 3) {
                System.out.println("Reproduciendo intro " + i);
            } else if (i < 7) {
                System.out.println("Reproduciendo pelicula " + i);
            } else {
                System.out.println("Reproduciendo creditos " + i);
            }

            i++;

        }

        for (int j = 0; j < duration; j++) {
            if (j < 3) {
                System.out.println("Reproduciendo intro " + j);
            } else if (j < 7) {
                System.out.println("Reproduciendo pelicula " + j);
            } else {
                System.out.println("Reproduciendo creditos " + j);
            }

        }

    }
}
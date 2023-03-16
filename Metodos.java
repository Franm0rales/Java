public class Metodos {
    public static void main(String[] args) {
        String[] titleArray = new String[] { "La naranja mecanica", " Buscando a Nemo", "Mision Imposible", "Star Wars",
                "Troya", " Yo Robot", " Ip Man" };

        String title = playMovie(titleArray, 1);
        pauseMovie(title);
    }

    public static String playMovie(String[] titleArray, int index) {

        if (index < titleArray.length) {

            String title = titleArray[index];

            for (int i = 0; i < 10; i++) {
                System.out.println("Playing movie..." + title);
            }
            return title;
        } else {

            System.out.println("Index es muy grande...");
            return "";
        }

    }

    public static void pauseMovie(String title) {
        if (title.isEmpty()) {
            System.out.println("No hay peliculas");
        } else {
            System.out.println("Paused movie..." + title);
        }

    }
}

import java.util.Random;

//Puedes crear metodos con el mismo nombre pero diferentes argumentos
public class Metodos {
    public static void main(String[] args) {
        // ClasesMovie es una clase

        ClasesMovie toyStory = new ClasesMovie("Toy Story", "Familiar", 90);
        ClasesMovie StarWars = new ClasesMovie("Star Wars", 120);
        // Objetos de la clase
        toyStory.setTitle("Toy Story");
        toyStory.setGenero("Infantil");
        toyStory.setDuracion(90);

        System.out.println(toyStory.getTitle() + " " + toyStory.getGenero() + " " + toyStory.getDuracion());
        System.out.println(StarWars.getTitle() + " " + StarWars.getDuracion());

        String[] titleArray = new String[] { "La naranja mecanica", " Buscando a Nemo", "Mision Imposible", "Star Wars",
                "Troya", " Yo Robot", " Ip Man" };

        String title = playMovie(titleArray, 1);
        String title2 = playMovie(titleArray);
        pauseMovie(title);
        pauseMovie(title2);
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

    public static String playMovie(String[] titleArray) {
        Random random = new Random();
        int index = random.nextInt(titleArray.length - 1);
        String title = titleArray[index];

        for (int i = 0; i < 10; i++) {
            System.out.println("Playing movie: " + title);
        }
        return title;

    }

    public static void pauseMovie(String title) {
        if (title.isEmpty()) {
            System.out.println("No hay peliculas");
        } else {
            System.out.println("Paused movie..." + title);
        }

    }
}

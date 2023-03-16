public class ArraysString {

    public static void main(String[] args) {
        String[] movieTitleArray = new String[] { "Up", "Titanic", "Aladdin", "Pepe el toro", "Matrix", "Avengers" };

        for (String tittle : movieTitleArray) {
            if (!tittle.contains("i")) {
                System.out.println(tittle);
            }

        }
    }

}

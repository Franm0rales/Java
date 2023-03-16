
public class Hola_Mundo {

    public static void main(String[] args) {
        String saludo = "Hola mundo que tal el dia?";
        int longitud = saludo.length();
        boolean stringVacio = saludo.isEmpty();
        boolean containsString = saludo.contains("mund");
        String substring = saludo.substring(2, 7);
        String newString = saludo.replace("o", "5");
        System.out.println("La longitud del saludo es:" + longitud);
        System.out.println("La longitud del saludo esta vacia?:" + stringVacio);
        System.out.println("contiene algun caracter saludo de esa cadena?:" + containsString);
        System.out.println("String desde la posicion indicada es:" + substring);
        System.out.println("String que reemplaza o por 5:" + newString);
        int edad = 25;
        System.out.println("Mi edad es:" + edad);

        float altura = 1.75f;
        System.out.println("Mi altura es:" + altura);

        double valorDePi = 3.1415132423534545;
        System.out.println("El valor de Pi es:" + valorDePi);

        long distanciaAlSol = 45434564536453645L;
        System.out.println("La distancia al sol es:" + distanciaAlSol);

        boolean isDay = true;
        System.out.println("isDay es:" + isDay);

        char miInicial = 'F';
        System.out.println("Mi inicial es:" + miInicial);

        System.out.println(String.format("Mi edad es: %d %d", edad, 32));
        System.out.println(String.format("Mi altura es: %.2f ", altura));

        // Rectangle
        int a = 15;
        int b = 8;

        // Area
        int rArea = a * b;

        // Perimetro
        int rPerimeter = b + a + b + a;

        // Triangulo
        b = 5;
        a = 3;

        // Area triangulo
        double tArea = b * a / 2.0;

        // Hypotenuse

        double sumaCatetos = Math.pow(b, 2) + Math.pow(a, 2);
        double area = Math.sqrt(sumaCatetos);

        // Circulo
        int r = 60;

        // Area
        double pi = Math.PI;
        double cArea = pi * Math.pow(r, 2);

        System.out.println("El area del rectangulo es: " + rArea);
        System.out.println("El perimetro del rectangulo es: " + rPerimeter);
        System.out.println("El area del triangulo es: " + tArea);
        System.out.println("El area del circulo es: " + cArea);
        System.out.println("Hypotenuse triangulo es: " + area);
    }

}

public class ClasesMovie {
    String title;
    String genero;
    int duracion;

    // Puedes tener mas de un construnctor pero sin tener los mismos argumentos
    public ClasesMovie(String title, String genero, int duracion) {
        this.title = title;
        this.genero = genero;
        this.duracion = duracion;

    }

    public ClasesMovie(String title, int duracion) {
        this.title = title;
        this.duracion = duracion;

    }

    // Geters and Seters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}

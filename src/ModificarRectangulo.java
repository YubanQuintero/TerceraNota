class Rectangulo {
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void mostrarDimensiones() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }
}

public class ModificarRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);

        System.out.println("Antes de llamar al método modificar:");
        rectangulo.mostrarDimensiones();

        modificarRectangulo(rectangulo);

        System.out.println("Después de llamar al método modificar:");
        rectangulo.mostrarDimensiones();
    }

    public static void modificarRectangulo(Rectangulo rect) {
        rect.ancho = 20; // Modifica el ancho del objeto
        rect.alto = 30;  // Modifica el alto del objeto

        System.out.println("Dentro del método modificar:");
        rect.mostrarDimensiones();
    }
}

public class AreaPoligonos {

    public static void main(String[] args) {
        // Ejemplos de uso:
        System.out.println("Área del triángulo (base=5, altura=10): " + calcularArea("triángulo", 5, 10));
        System.out.println("Área del cuadrado (lado=4): " + calcularArea("cuadrado", 4, 0));
        System.out.println("Área del rectángulo (base=6, altura=8): " + calcularArea("rectángulo", 6, 8));
    }

    public static double calcularArea(String tipoPoligono, double dimension1, double dimension2) {
        tipoPoligono = tipoPoligono.toLowerCase();

        switch (tipoPoligono) {
            case "triángulo":
                return (dimension1 * dimension2) / 2;

            case "cuadrado":
                return dimension1 * dimension1;

            case "rectángulo":
                return dimension1 * dimension2;

            default:
                System.out.println("Error: Tipo de polígono no soportado.");
                return -1;
        }
    }
}

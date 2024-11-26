public class TiendaRopa {
    public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        double descuentoCamiseta = 0.15;
        double descuentoPantalon = 0.15;

        double precioCamisetaDescuento = precioCamiseta - (precioCamiseta * descuentoCamiseta);
        double precioPantalonDescuento = precioPantalon - (precioPantalon * descuentoPantalon);

        double precioTotal = precioCamisetaDescuento + precioPantalonDescuento;

        double precioSegundaCamisetaDescuentoAdicional = precioCamisetaDescuento - (precioCamisetaDescuento * 0.05);
        precioTotal += precioSegundaCamisetaDescuentoAdicional;

        System.out.println("El precio total de ambas prendas es: $" + precioTotal);
    }
}

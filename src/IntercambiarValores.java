public class IntercambiarValores {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes de llamar al método intercambiar:");
        System.out.println("a = " + a + ", b = " + b);

        intercambiar(a, b);

        System.out.println("Después de llamar al método intercambiar:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Dentro del método intercambiar:");
        System.out.println("x = " + x + ", y = " + y);
    }
}

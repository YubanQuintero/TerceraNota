public class ContadorPares {
    public static void main(String[] args) {
        int contador = 0;
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}

public class ModificarArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Antes de llamar al método modificar:");
        mostrarArray(numeros);

        modificarArray(numeros);

        System.out.println("Después de llamar al método modificar:");
        mostrarArray(numeros);
    }

    public static void modificarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2; // Multiplica cada elemento por 2
        }

        System.out.println("Dentro del método modificar:");
        mostrarArray(array);
    }

    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

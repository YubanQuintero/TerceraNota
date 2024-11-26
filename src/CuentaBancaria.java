public class CuentaBancaria {
    public static void main(String[] args) {
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanas = 4;

        double saldoFinal = saldoInicial - (retiroSemanal * semanas);

        System.out.println("El dinero que le quedará en su cuenta al final del mes es: $" + saldoFinal);
    }
}

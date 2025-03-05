import java.util.Scanner;

public class Ejercicio4 {
/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería. */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String [][] frutas = {
        {"1", "Manzana", "4.00"},
        {"2", "Banano", "2.50"},
        {"3", "Pera", "3.80"},
        {"4", "Uva", "6.00"},
        {"5", "Naranja", "2.20"}
    };
    System.out.println("================================");
    System.out.println("       LISTA DE FRUTAS        ");
    System.out.println("================================");
    System.out.printf("%-5s %-10s %-10s%n", "N°", "Fruta", "Precio x Kg");
    System.out.println("--------------------------------");
    for (String[] fruta : frutas) {
    System.out.printf("%-5s %-10s $%-10s%n", fruta[0], fruta[1], fruta[2]);
}
    System.out.println("--------------------------------");
    System.out.print("Ingrese el número de la fruta que desea comer: ");
    int opcion = scanner.nextInt();
    if (opcion < 1 || opcion > frutas.length) {
        System.out.println("Opción no válida. Saliendo...");
        return;
    }
    String nombreFruta = frutas[opcion - 1][1];
double precioKilo = Double.parseDouble(frutas[opcion - 1][2]);
System.out.print("Ingrese la cantidad de kilos comprados: ");
double kilos = scanner.nextDouble();
double descuento = 0;
if (nombreFruta.equalsIgnoreCase("Manzana")) {
    if (kilos > 10) {
        descuento = 0.20;
    } else if (kilos > 5) {
        descuento = 0.15;
    } else if (kilos > 2) {
        descuento = 0.10;
    }
}
double subtotal = precioKilo * kilos;
double montoDescuento = subtotal * descuento;
double total = subtotal - montoDescuento;
System.out.println("\n================================");
System.out.println("             FACTURA          ");
System.out.println("================================");
System.out.println("Fruta seleccionada: " + nombreFruta);
System.out.println("Precio por kilo: $" + precioKilo);
System.out.println("Cantidad comprada: " + kilos + " kg");
System.out.println("Subtotal: $" + subtotal);
if (descuento > 0) {
    System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
    System.out.println("Monto de descuento: $" + montoDescuento);
}
System.out.println("--------------------------------");
System.out.println("TOTAL A PAGAR: $" + total);
System.out.println("================================");
scanner.close();
}
}

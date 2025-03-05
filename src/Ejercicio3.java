import java.util.Scanner;

public class Ejercicio3 {
    /*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%. */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("\n====================================");
        System.out.println("          MARCAS DISPONIBLES       ");
        System.out.println("====================================");
        System.out.printf("%-10s | %-10s%n", "Marca", "Precio Ref.");
        System.out.println("------------------------------------");
        System.out.printf("%-10s | $%-10.2f%n", "NOSY", 550.00);
        System.out.printf("%-10s | $%-10.2f%n", "SONYX", 480.00);
        System.out.printf("%-10s | $%-10.2f%n", "SAMSUNG", 600.00);
        System.out.printf("%-10s | $%-10.2f%n", "LG", 450.00);
        System.out.printf("%-10s | $%-10.2f%n", "BOSE", 700.00);
        System.out.println("====================================");

    System.out.println("Bienvenido a Reproductores On Line");
    System.out.print("Ingresa la marca del reproductor que deseas llevar: ");
    String marca = sc.nextLine();
    sc.nextLine();

    System.out.print("Ingresa el precio del reproductor que deseas llevar: $");
    double precio = sc.nextDouble();
    
    double descuento1 = 0, descuento2 = 0;


    if (marca.equalsIgnoreCase("NOSY")) {
    descuento2 = precio * 0.5;
    }
    if (precio >= 500) {
    descuento1 = precio * 0.10;
    } 
 double precioDescuento = precio - descuento1 - descuento2;
 double precioConIva = precioDescuento * 1.19;
 double total = precioDescuento + precioConIva;

 System.out.println("\n==============================");
 System.out.println("           FACTURA           ");
 System.out.println("==============================");
 System.out.printf("%-20s: $%.2f%n", "Precio Original", precio);
 System.out.printf("%-20s: -$%.2f%n", "Descuento por precio", descuento1);
 System.out.printf("%-20s: -$%.2f%n", "Descuento por marca", descuento2);
 System.out.println("------------------------------");
 System.out.printf("%-20s: $%.2f%n", "Subtotal", precioDescuento);
 System.out.printf("%-20s: +$%.2f%n", "IVA (19%)", precioConIva);
 System.out.println("------------------------------");
 System.out.printf("%-20s: $%.2f%n", "TOTAL A PAGAR", total);
 System.out.println("==============================");




}

}

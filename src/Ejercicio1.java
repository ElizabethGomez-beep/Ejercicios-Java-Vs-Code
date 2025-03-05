import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*En una tienda de computadoras se planea ofrecer a los clientes un descuento que 
        dependerá del número de equipos que compre. Si las computadoras son menos de cinco
        se les dará un 10% de descuento sobre el total de la compra; si el número de computadoras
        es mayor o igual a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10
        o más se les da un 40% de descuento. El precio de cada computadora es de U$500.
     */
        
     //definir constante
     final double PRECIO_POR_COMPUTADORA = 1200.0;
     
        Scanner scanner = new Scanner(System.in);

        int cantidadInt = 0;
        boolean continuarCompra = true;

        while (continuarCompra) {
            System.out.println("Bienvenido a Electrics SAS");
            System.out.println("Ingresa la cantidad de computadores que deseas llevar:");
            cantidadInt += scanner.nextInt();
            
            System.out.println("¿Desea agregar otro computador? (si/no): ");
            String respuestaString = scanner.next(). toLowerCase();
            if (!respuestaString.equals ("si")) {
                continuarCompra = false;

                
            } 
        }

        double descuento;
        if (cantidadInt < 5) {
            descuento = 0.10; //10%
        } else if (cantidadInt >= 5){
            descuento = 0.20; //20%
        } else {
            descuento = 0.40;
        }

        double totalSindescuento = cantidadInt * PRECIO_POR_COMPUTADORA;
        double totalConDescuento = totalSindescuento * (1 - descuento);


        System.out.println("Total sin descuento: $" + totalSindescuento);
        System.out.println("Descuento aplicado: "+ (descuento*100) + "%");
        System.out.println("Total a pagar: $" + totalSindescuento);
scanner.close();
       }
}


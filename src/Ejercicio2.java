import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       /*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido Señor Usuario");
        System.out.println("En Llantas Movitec estamos encantados de servirte");
        System.out.println("Ingresa la cantidad de llantas a comprar");
        int cantidad = sc.nextInt();

        int precioUnitario;

        if (cantidad < 5 ) {
            precioUnitario = 100;
        }else if (cantidad <= 10) {
            precioUnitario = 75;
          }  else {
                precioUnitario = 50;
            }
            int total = cantidad * precioUnitario;
            System.out.println("El precio por llanta es: $"+ precioUnitario);
            System.out.println("El total a pagar es de: $" + total);
sc.close();
        }
}

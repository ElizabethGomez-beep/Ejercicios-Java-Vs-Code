import java.util.Scanner;

public class Ejercicio14 {
    /*Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
        de selección múltiple dentro de otra */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        System.out.print("Ingrese el número de su elección: ");
        int tipoVehiculo = scanner.nextInt();

        String vehiculo = "";
        String color = "";

        switch (tipoVehiculo) {
            case 1:
                vehiculo = "Auto";
                break;
            case 2:
                vehiculo = "SUV";
                break;
            case 3:
                vehiculo = "Camioneta";
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                System.exit(0);
        }

        System.out.println("\nSeleccione el color del vehículo:");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        System.out.print("Ingrese el número de su elección: ");
        int tipoColor = scanner.nextInt();

        switch (tipoColor) {
            case 1:
                color = "Negro";
                break;
            case 2:
                color = "Blanco";
                break;
            case 3:
                color = "Rojo";
                break;
            default:
                System.out.println("Opción de color no válida. Saliendo del programa.");
                System.exit(0);
        }

        System.out.println("\n=================================");
        System.out.println("      SELECCIÓN FINAL     ");
        System.out.println("=================================");
        System.out.println("Tipo de vehículo: " + vehiculo);
        System.out.println("Color: " + color);
        System.out.println("=================================");

        scanner.close();
    }
}

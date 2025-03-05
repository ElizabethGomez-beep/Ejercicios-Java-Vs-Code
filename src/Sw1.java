import java.util.Scanner;

public class Sw1 {public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
int opcion;
System.out.println("Menú Areas");
System.out.println("1 - circulo");
System.out.println("2 - triangulo");
System.out.println("9 - Salir");
System.out.println("Ingrese la opción");
opcion=sc.nextInt();
switch (opcion){
    case 1:
         System.out.println("Valor del radio");
        int radio=sc. nextInt();
         double area=Math.PI*Math.pow(radio, 2);
        System.out.println("Area="+area);
         break;
    case 2:
        System.out.println("Area Triangulo...");
        break;
    case 9:
    System.out.println("Gracias por usar el programa!");
    break;
    default:
    System.out.println("Opción no valida!");


}
}

}

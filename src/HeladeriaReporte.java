import java.util.Scanner;

public class HeladeriaReporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean indSabor=true;
        int acumLimon=0,acumNuez=0,acumUlo=0,acumFresa=0,acumCrema=0;

    while(indFac){}


        while (indSabor) {
        System.out.println("Menú sabores");
        System.out.println("1 - Limón");
        System.out.println("2 - Nuez");
        System.out.println("3 - Lulo");
        System.out.println("4 - Fresa");
        System.out.println("5 - Crema");
        System.out.println("Seleccione un sabor");
        int sabor=sc.nextInt();
        sc.nextLine();
        switch (sabor) {
            case 1:
                System.out.println("Cantidad de paletas de Limón");
                int cantL=sc.nextInt();
                sc.nextLine();
                //Validar la cantidad ingresada
                acumLimon+=cantL;
                break;

            case 2:
                System.out.println("Cantidad de paletas de Nuez");
                int cantN=sc.nextInt();
                sc.nextLine();
                //Validar la cantidad ingresada
                acumNuez+=cantN;
                break;


        }
        System.out.println("Desea incluir otro sabor: (S/N)");
        String rta=sc.nextLine();
        //if (rta=="S")
        if (rta.toUpperCase().equals("S")) 
             indSabor=true;
        else
              indSabor=false;
         

    }
    }
}

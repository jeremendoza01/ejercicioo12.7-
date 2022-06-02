import java.io.*;
import java.util.Scanner;

class App {

    public static void main(String[] a) throws IOException {

        // No se para que usar el sgte osea se q hace pero no se como usarlo
        // TipoSocio sgte;
        Scanner input = new Scanner(System.in);
        int x, control, menu;
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();
        int codigo, edad, dia, mes, año;
        String nombre;
        control = 1;

        System.out.println("Hola bienvenidos al programa! ");
        do {

            System.out.println("1 - Añanir un socio");
            System.out.println("2 - Buscar socio");
            System.out.println("3 - Eliminar un socio");
            System.out.println("0 - Salir");
            System.out.println("");
            menu = input.nextInt();
            input.nextLine();

            // System.out.println("La clave es " + x);
            switch (menu) {
                case 1:
                    // Insertar un socio
                    System.out.println("ingrese el nombre: ");
                    nombre = input.nextLine();
                    System.out.println("ingrese el codigo: ");
                    codigo = input.nextInt();
                    System.out.println("ingrese edad: ");
                    edad = input.nextInt();
                    System.out.println("ingrese el dia: ");
                    dia = input.nextInt();
                    System.out.println("ingrese el mes: ");
                    mes = input.nextInt();
                    System.out.println("ingrese el año: ");
                    año = input.nextInt();
                    TipoSocio socio = new TipoSocio(nombre, codigo, edad, dia, mes, año);
                    tabla.insertar(socio);
                    break;

                case 2:
                    // Buscar un socio
                    System.out.println("Ingrese la clave para buscar el mismo ");
                    int busqueda = input.nextInt();
                    input.nextLine();
                    tabla.buscar(busqueda).getSocio().muestra();
                    break;

                case 3:
                    // Eliminar un socio
                    System.out.println("Ingrese la clave para eliminar un socio");
                    int socioxd = input.nextInt();
                    input.nextLine();
                    tabla.eliminar(socioxd);
                    break;
                case 0:
                    System.out.println("Ha finalizado el programa! ");
                    control = control - 1;
                    break;
            }

        } while (control != 0);
    }
}

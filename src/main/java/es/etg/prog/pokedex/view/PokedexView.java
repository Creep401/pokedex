package es.etg.prog.pokedex.view;
import java.util.Scanner;

public class PokedexView {
    private final Scanner sc = new Scanner(System.in);
    public static final int OPC_MENU_SALIR = 3;

    public void mostrarMenu(){ //Imprime las opciones del menu
        System.out.println("Seleccione su opcion");
        System.out.println("1. Buscar un pokemon por su nombre.");
        System.out.println("2. Buscar un pokemon por su número.");
        System.out.println("3. Salir.");
    }
    public String leerString(){
        System.out.println("Buscar: ");
        String nombre = sc.nextLine(); //Lee una variable String
        return nombre;
    }

    public int leerEntero(){
        System.out.println("Buscar: ");
        int numero = sc.nextInt();
        sc.nextLine(); //para limpiar el buffer
        return numero;
    }
}

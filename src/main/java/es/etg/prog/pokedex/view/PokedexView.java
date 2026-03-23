package es.etg.prog.pokedex.view;
import java.util.Scanner;

public class PokedexView {
    private final Scanner sc = new Scanner(System.in);
    static final String MENU = "Seleccione su opcion";
    static final String OPCION1 = "1. Buscar un pokemon por su nombre.";
    static final String OPCION2 = "2. Buscar un pokemon por su número.";
    static final String OPCION3 = "3. Salir.";
    static final String BUSQUEDA = "Buscar: ";

    public void mostrarMenu(){ //Imprime las opciones del menu
        System.out.println(MENU);
        System.out.println(OPCION1);
        System.out.println(OPCION2);
        System.out.println(OPCION3);
    }
    public String leerString(){
        System.out.println(BUSQUEDA);
        String nombre = sc.nextLine(); //Lee una variable String
        return nombre;
    }

    public int leerEntero(){
        System.out.println(BUSQUEDA);
        int numero = sc.nextInt();
        sc.nextLine(); //para limpiar el buffer
        return numero;
    }
}

package es.etg.prog.pokedex.controller;
import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController { 
    private final PokedexView vista;

    public PokedexController(PokedexView vista){
        this.vista = vista;
    }

    public void init(){
        int opcion;
        do { 
            vista.mostrarMenu();
            opcion = vista.leerEntero();
            switch (opcion) {
                case 1 -> vista.leerString();
                case 2 -> vista.leerEntero();
                case 3 -> {}
                default -> throw new AssertionError();
            }
        } while (opcion != 3);
    }
}

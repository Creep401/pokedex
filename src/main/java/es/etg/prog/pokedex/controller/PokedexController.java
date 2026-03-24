package es.etg.prog.pokedex.controller;
import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController { 
    private final PokedexView vista;

    public PokedexController(PokedexView vista){
        this.vista = vista;
    }

    public void init(){
        boolean salir = false;
        int opcion;
        do { 
            vista.mostrarMenu();
            opcion = vista.leerEntero();
            switch (opcion) {
                case 3 -> salir = true;
            }
        } while (!salir);
    }
}

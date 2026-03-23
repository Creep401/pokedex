package es.etg.prog.pokedex;

import es.etg.prog.pokedex.view.PokedexView;
import es.etg.prog.pokedex.controller.PokedexController;

public class Main {
    public static void main(String[] args) {
        PokedexView vista = new PokedexView();
        PokedexController controlador = new PokedexController(vista);

        System.out.println("-----Inicializando POKEDEX-----");
        controlador.init();
        System.out.println("-----\tCerrando POKEDEX-----");
    }
}
package es.etg.prog.pokedex;

import es.etg.prog.pokedex.controller.PokedexController;
import es.etg.prog.pokedex.view.PokedexView;

public class Main {
    public static void main(String[] args) {
        PokedexView vista = new PokedexView();
        PokedexController controlador = new PokedexController(vista);
        final String INICIO = "-----Inicializando POKEDEX-----";
        final String FINAL = "-----\tCerrando POKEDEX\t-----";

        System.out.println(INICIO);
        controlador.init();
        System.out.println(FINAL);
    }
}
package es.etg.prog.pokedex.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Pokemon {
    
    public enum Tipo {
        PLANTA,AGUA,FUEGO,NORMAL,VOLADOR,TIERRA,ROCA,LUCHA,VENENO,PSIQUICO,BICHO,ACERO,SINIESTRO,HIELO,ELECTRICO,HADA
    }

    private final int id_pkmn;
    private final String nm_pkmn;
    private Tipo tipo1;
    private Tipo tipo2;
    private boolean capturado;

    public Pokemon (int id_pkmn,String nm_pkmn,Tipo tipo1,Tipo tipo2){
        this.id_pkmn = id_pkmn;
        this.nm_pkmn = nm_pkmn;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }
}

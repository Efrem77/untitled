package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Sunkern extends Pokemon {
    public Sunkern () {
        this("Sunkern", 1);
    }

    public Sunkern(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(30, 30, 30, 30, 30, 30);
        this.addMove(new Facade());
        this.addMove(new Confide());
        this.addMove(new Rest());
    }

}
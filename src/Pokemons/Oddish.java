package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Oddish extends Pokemon {
    public Oddish () {
        this("Oddish", 1);
    }

    public Oddish(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(45, 50, 55, 75, 65, 30);
        this.addMove(new StunSpore());
        this.addMove(new Venoshock());

    }

}

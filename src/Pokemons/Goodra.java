package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Goodra extends Sliggoo {
    public Goodra () {
        this("Goodra", 1);
    }

    public Goodra(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON);
        this.setStats(90, 100, 70, 110, 150, 80);
        this.addMove(new FireBlast());
    }

}

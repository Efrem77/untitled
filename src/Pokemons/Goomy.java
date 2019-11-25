package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Goomy extends Pokemon {
    public Goomy () {
        this("Goomy", 1);
    }

    public Goomy(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON);
        this.setStats(45, 50, 35, 55, 75, 40);
        this.addMove(new Swagger());
        this.addMove(new Facade());

    }

}
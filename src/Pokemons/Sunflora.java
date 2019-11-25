package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Sunflora extends Sunkern {
    public Sunflora () {
        this("Sunflora", 1);
    }

    public Sunflora(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(75, 75, 55, 105, 85, 30);
        this.addMove(new ZenHeadbutt());
    }

}
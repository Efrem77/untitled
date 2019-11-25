package Pokemons;


import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Sliggoo extends Goomy {
    public Sliggoo () {
        this("Sliggoo", 1);
    }

    public Sliggoo(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON);
        this.setStats(68, 75, 53, 83, 113, 60);
        this.addMove(new DreamEater());
    }

}
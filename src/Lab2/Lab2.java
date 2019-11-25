package Lab2;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Oddish("Вован",3));
        b.addAlly(new Sunflora("Леха",4));
        b.addAlly(new Sunkern("Акакий",2));
        b.addFoe(new Goomy("Безумный Паша", 2));
        b.addFoe(new Sliggoo("Олег Монгол", 3));
        b.addFoe(new Goodra("Кирилл Руки-Базуки", 1));
        b.go();
    }
}

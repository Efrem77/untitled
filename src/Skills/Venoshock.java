package Skills;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if ((p.getCondition() == Status.POISON)) {
            this.power *= 2;
        }
    }
    @Override
    protected String describe() {
        return "Venoshock";
    }


}


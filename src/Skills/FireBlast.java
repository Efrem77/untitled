package Skills;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).condition(Status.BURN));
        }




    @Override
    protected String describe() {
        return "FireBlast";
    }


}
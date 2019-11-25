package Skills;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
        Effect e = new Effect().turns(2).stat(Stat.ATTACK, 1);
        p.setCondition(e);
    }

    @Override
    protected String describe() {
        return "Swagger";
    }

}
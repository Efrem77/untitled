package Skills;

import ru.ifmo.se.pokemon.*;

public class ZenHeadbutt extends PhysicalMove {
    public ZenHeadbutt() {
        super(Type.PSYCHIC, 80, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2);
        e.flinch(p);
        p.addEffect(e);
        }




    @Override
    protected String describe() {
        return "ZenHeadbutt";
    }


}
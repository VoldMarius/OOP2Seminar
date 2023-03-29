package units;

public class Crossbowman  extends BaseHero {
    int bolt;
    int accuracy;

    public Crossbowman (String name) {
        super(100, name, 1, 6, 50, new int[]{30, 60},"Арбалетчик ");
        bolt = 30;
        accuracy = 50;

    }
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
}

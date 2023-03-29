package units;

public class Sniper extends BaseHero {
    int arrows;
    int accuracy;

    public Sniper(String name) {
        super(100, name, 1, 6, 30, new int[]{50, 100},"Снайпер ");
        arrows = 10;
        accuracy = 70;

    }
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Снайпер";
    }
}


package units;

public class Thief extends BaseHero {

    public Thief(String name) {
        super(100, name, 1, 6, 50, new int[]{25, 40}, "Вор");
    }
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Вор";
    }
}
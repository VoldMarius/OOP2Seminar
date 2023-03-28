package units;

public class Spearman extends BaseHero {

    public Spearman(String name) {
        super(100, name, 1, 5, 80, new int[]{20, 50}, "Копейщик");
    }
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Копейщик";
    }
}
package units;

public class Wizard extends BaseHero {
    int magic;
    int accuracy;

    public Wizard(String name) {
        super(100, name, 1, 1, 30, new int[]{25, 40},"Маг ");
        magic = 10;
        accuracy = 70;

    }
}
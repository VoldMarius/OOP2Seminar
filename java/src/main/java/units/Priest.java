package units;

public class Priest extends BaseHero {
    int treatment;
    int accuracy;

    public Priest(String name) {
        super(100, name, 1, 3, 30, new int[]{20, 40},"Монах ");
        treatment = 10;
        accuracy = 70;

    }
}


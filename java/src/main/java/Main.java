import units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static <objekt> void main(String[] args) {

        Sniper sn = new Sniper("Bob");
        Crossbowman cr = new Crossbowman("Greg");
        Wizard wz = new Wizard("David");
        Priest pr = new Priest("Iov");
        Inhabitant inh = new Inhabitant("Ivan");
        Spearman sp = new Spearman("Gollem");
        Thief tf = new Thief("Igor");
        List unit = new ArrayList();
        unit.add(sn);
        unit.add(cr);
        unit.add(wz);
        unit.add(pr);
        unit.add(inh);
        unit.add(sp);
        unit.add(tf);
        for (Object n :unit) {
            System.out.print(n + "\n");
        }

        ArrayList<BaseHero> heroList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(7)) {
                case 0 -> heroList.add(new Spearman(getName()));
                case 1 -> heroList.add(new Sniper(getName()));
                case 2 -> heroList.add(new Crossbowman(getName()));
                case 3 -> heroList.add(new Inhabitant(getName()));
                case 4 -> heroList.add(new Priest(getName()));
                case 5 -> heroList.add(new Wizard(getName()));
                default -> heroList.add(new Thief(getName()));
            }
        }
        int index  = 1;
        while (index < 11) {
            System.out.println(index +".  " + heroList.get(index-1).class_name + " по имени:  " + getName());
            index ++;
        }
        }
    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}

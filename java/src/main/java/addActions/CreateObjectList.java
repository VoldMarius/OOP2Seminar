package addActions;

import units.*;

import java.util.ArrayList;
import java.util.Random;

public class  CreateObjectList {
    public static void createList(int num, int numClass){
        ArrayList<BaseHero> heroList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            switch (random.nextInt(numClass)) {
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
        while (index < num+1) {
            System.out.println(index +".  " + heroList.get(index-1).class_name + " по имени:  " + getName());
            index ++;
        }
    }
    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}

import addActions.CreateObjectList;
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
        System.out.println("Первый список");
        CreateObjectList.createList(10,7);
        System.out.println("Второй список");
        CreateObjectList.createList(10,7);

        }

}

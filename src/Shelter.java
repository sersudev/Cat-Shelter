import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Cat> cats = new ArrayList<>();
    void addCat(String name) {
        cats.add(new Cat(name));
    }
    void feedAllCats() {
        for (Cat x: cats) {
            x.feed();
        }
        System.out.println("Покормили всех нужных котиков");
    }
    void findHungriestCat() {
        int maxLevelOfHunger = cats.get(0).getHungerLevel();
        int sumOfHungerLevel = 0;
        boolean flag = false;
        for (Cat x: cats) {
            sumOfHungerLevel += x.getHungerLevel();
            if (x.getHungerLevel() > maxLevelOfHunger) {
                maxLevelOfHunger = x.getHungerLevel();
                flag = true;
            }
        }
        if (sumOfHungerLevel == 0) {
            System.out.println("Все котики сыты. Кормежка не требуется");
        } else {
            System.out.println("Самые голодные котики под именами: ");
            for (Cat x : cats)
                if (x.getHungerLevel() == maxLevelOfHunger) System.out.print(x.getName() +  " ");
        }
        System.out.println();
    }
    List<Cat> getCatsList() {return cats;}
}

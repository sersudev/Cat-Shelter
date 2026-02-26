public class Cat {
    private String name;
    private int hungerLevel;

    Cat (String name) {
        this.name = name;
        hungerLevel = 5;
    }

    int getHungerLevel() {return hungerLevel;}

    String getName () {return name;}


    void feed() {
        System.out.println("Кормим котика " + name);
        if (hungerLevel != 0) {
            hungerLevel -= 2;
            System.out.println("Уровень голода котика "  + name + " - " + hungerLevel);
        } else System.out.println("Уровень голода котика "  + name + " минимальный, кормежка не требуется.");
    }
    void play() {
        System.out.println("Играем с котом " + name);
        if (hungerLevel != 10) {
            hungerLevel += 1;
            System.out.println("Уровень голода котика " + name + " - " + hungerLevel);
        } else System.out.println("Уровень голода котика "  + name + " максимальный, следует покормить котика");
    }
    void meow() {
        System.out.println("Котик " + name + " говорит Мяу. Уровень его голода - " + hungerLevel);
    }
}

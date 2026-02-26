public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        shelter.addCat("Тося");
        shelter.addCat("Мося");
        shelter.addCat("Лося");
        shelter.getCatsList().get(0).feed();
        shelter.findHungriestCat();
    }
}

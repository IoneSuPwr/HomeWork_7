package main.java.pack_7;


public class HomeWork_7 {
    public static void main(String[] args) {
        Plate plate = new Plate(55);
        Cat[] cats = new Cat[] {
                new Cat("Vasya",9),
                new Cat("Sammy", 13),
                new Cat("leo",11),
                new Cat("Garou",8),
                new Cat("Mihal Palych", 10),
        };

        feedCats(cats, plate);
        plate.refill(5);
        feedCats(cats, plate);
    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for(Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        System.out.println();
    }
}

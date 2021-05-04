package main.java.pack_7;

public class Cat {
    private final String name;
    private final int appeti;
    private boolean satiety;

    public Cat(final  String name, final int appeti) {
        this.name = name;
        this.appeti = appeti;
        this.satiety = false;
    }

    public void eat(final Plate p) {
        if (!satiety) {
            satiety = p.decreaseFood(appeti);
        }
    }
    public void info() {
        System.out.printf("Кот %s с аппетитом %d %s\n", name, appeti, satiety ? "сытый" : "голодный");
    }
}

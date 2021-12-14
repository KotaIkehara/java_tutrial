public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Wizard w1 = new Wizard();
        Wizard w2 = new Wizard();

        h1.setHp(h1.getHp() + 50);
        h2.setHp(h2.getHp() + 50);
        w1.setHp(w1.getHp() + 50);
        w2.setHp(w2.getHp() + 50);
    }
}

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("minato");
        System.out.println(h1.hp);
        Hero h2 = new Hero("akasa");
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}

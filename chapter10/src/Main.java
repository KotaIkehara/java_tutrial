public class Main {
    public static void main(String[] args) {
        Hero.setRandomMoney();
        System.out.println(Hero.money);

        Hero h1 = new Hero();
        Hero h2 = new Hero();
        System.out.println(h1.hp);
        System.out.println(Hero.money);
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}

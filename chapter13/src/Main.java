public class Main {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];

        monsters[0] = new Slime();
        monsters[1] = new Slime();
        monsters[2] = new Slime();

        for (Monster m : monsters) {
            m.run();
        }
    }
}

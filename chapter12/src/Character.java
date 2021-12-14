public abstract class Character {
  String name;
  int hp;

  // 逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }

  public abstract void attack(Matango m);

  public String getName() {
    return this.name;
  }
}

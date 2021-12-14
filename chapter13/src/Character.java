public abstract class Character {
  String name;
  int hp;

  public abstract void attack(Monster m);

  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }

  public String getName() {
    return this.name;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    System.out.println("set hp:" + hp);
    this.hp = hp;
  }
}

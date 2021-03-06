public class Hero {
  private String name;
  private int hp;
  Sword sword;
  static int money;

  void bye() {
    System.out.println("勇者は別れを告げた");
  }

  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.print("GAME OVERです．");
  }

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
    this.hp -= 2;
    if (this.hp <= 0) {
      this.die();
    }
  };

  void run() {
    System.out.println(this.name + "は，逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  };

  void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は，" + sec + "秒座った！");
    System.out.println("HPが，" + sec + "ポイント回復した！");
  };

  void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は，転んだ！");
    System.out.println("5のダメージ！");
  };

  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は，眠って回復した！");
  };

  Hero(String name) {
    this.hp = 100;
    this.name = name;
  }

  Hero() {
    this("ダミー");
  }

  static void setRandomMoney() {
    Hero.money = (int) (Math.random() * 1000);
    System.out.println("所持金を初期化しました");
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("名前がnullである．処理を中断．");
    }
    if (name.length() <= 1) {
      throw new IllegalArgumentException("名前が短すぎる．処理を中断．");
    }
    if (name.length() >= 8) {
      throw new IllegalArgumentException("名前が長すぎる．処理を中断．");
    }
    this.name = name;
  }
}

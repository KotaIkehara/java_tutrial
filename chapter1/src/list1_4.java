public class list1_4 {
  public static void main(String[] args) throws Exception {
    double tax = 1.08;
    int fax = 5;
    System.out.println("5万円から4万円に値下げします");
    tax = 4;
    System.out.println("FAXの新価格（税込み）");
    System.out.println(fax * tax + "万円");
  }
}
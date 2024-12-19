public class MethodOverloading {
  public MethodOverloading() {
  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }

  public void add(String a, String b) {
    System.out.println(a + ' ' + b);
  }

  public static void main(String[] args) {
    MethodOverloading m = new MethodOverloading();
    // JAVA會自行去判斷
    m.add(1, 2);
    m.add("Hello", "world");
  }

}

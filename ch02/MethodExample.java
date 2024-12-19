public class MethodExample {
    public MethodExample() {

    }

    public void testing() {
        for (int i = 0; i < 100; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodExample m = new MethodExample();
        m.sayHello();
        int a = m.multiply(3, 5);
        int b = m.multiply(2, 1);
        System.out.println(a + b);
        m.testing();
    }
}

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 3; j > 0; j--) {
                System.out.println(i + ", " + j);
            }
        }
    }
}

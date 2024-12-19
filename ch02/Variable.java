public class Variable {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println(x + y);
        // x = x + 1;
        x += 1; // 語法糖
        System.out.println(x);

        final double PI = 3.14;
        System.out.println(PI);

        char lastLetter = 'R';
        String lastName = "Richel";
        System.out.println(lastLetter);
        System.out.println(lastName);

    }
}

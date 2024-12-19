public class ifStament {
    public static void main(String[] args) {
        boolean b = true;
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }

        int age = 20;

        if (age < 14 && age >= 0) {
            System.out.println("無行為能力人");
        } else if ((age >= 14 && age < 18) || age >= 80) {
            System.out.println("限制行為能力人");
        } else if (age >= 18 && age < 80) {
            System.out.println("完全行為能力人");
        }
    }
}

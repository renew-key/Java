public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            // if(i==5){
            // break;
            // }
            System.out.println(i);
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println("we are here");

        }
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println(j);
        }
    }
}

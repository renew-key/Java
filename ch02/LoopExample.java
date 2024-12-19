public class LoopExample {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            // System.out.println(i);
            count++;
        }
        System.out.println(count);

        String[] friends = { "Mike", "Grace", "Spencer", "Naleo", "Abigail" };
        // for(int i=0;i<friends.length;i++){
        // System.out.println(friends[i]+" is my frineds");
        // }
        for (String friend : friends) {
            System.out.println(friend + " is my friends");
        }
    }
}

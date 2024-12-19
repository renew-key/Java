import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ArrayExample {
    public static void main(String[] args) {
        String[] friends = { "Mike", "Grace", "Spencer", "Naleo", "Abigail" };
        System.out.println(friends[friends.length - 1]);
        System.out.println(friends);
        String[] students = new String[5];
        students[0] = "Mike";
        students[1] = "Grace";
        System.out.println(students[0]);
        System.out.println(students[1]);

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Mike");
        teachers.add("Grace");
        teachers.add("Spencer");
        teachers.add("Naleo");
        System.out.println(teachers.size());
        System.out.println(teachers.get(2));
        Collections.sort(teachers);
        System.out.println(teachers);
        teachers.clear();
        System.out.println(teachers);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        ArrayList<Float> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        ArrayList<Objects> arr3 = new ArrayList<>();
        ArrayList<ArrayList> arr4 = new ArrayList<>();

        int[][] my2Darray = new int[4][3];
        my2Darray[2][0] = 10;
        my2Darray[0][2] = 3;
    }
}

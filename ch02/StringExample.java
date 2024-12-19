public class StringExample {
    public static void main(String[] args) {
        String name = "Wilson";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.indexOf('s'));
        System.out.println(name.indexOf("il"));

        String age = "25";
        System.out.println(Integer.parseInt(age));
    }
}

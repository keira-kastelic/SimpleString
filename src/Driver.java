public class Driver {
    public static void main(String[] args) {
        SimpleString s = new SimpleString(); // testing the default constructor
        System.out.println(s);
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.toString());
        System.out.println(s.concat(s));
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,4));


    }
}

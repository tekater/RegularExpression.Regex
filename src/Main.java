public class Main {
    public static void main(String[] args) {
        String regex = "ale";
        System.out.println("ale - " + "ale".matches(regex));
        System.out.println(" ");
        ////
        String regex2 ="[Java][7-9]";
        System.out.println("j7 - " + "j7".matches(regex2));
        System.out.println("Java8 - " + "Java8".matches(regex2));
        System.out.println("J9 - " + "J9".matches(regex2));
        System.out.println("v8 - " + "v8".matches(regex2));
        ////

    }
}

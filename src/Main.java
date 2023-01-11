public class Main {
    public static void main(String[] args) {
        String regex = "ale";

        System.out.println("ale" + " - " + "ale".matches(regex));
        System.out.println(" ");
        ////
        String regex1 ="[Java][7-9]";

        System.out.println("Java :");
        System.out.println("j7" + " - " + "j7".matches(regex1));
        System.out.println("Java8" + " - " + "Java8".matches(regex1));
        System.out.println("J9" + " - " + "J9".matches(regex1));
        System.out.println("v8" + " - " + "v8".matches(regex1));
        System.out.println(" ");
        ////
        String regex0 ="[Java]{4}[7-9]";

        System.out.println("Java + захват {4} :");
        System.out.println("j7" + " - " + "j7".matches(regex0));
        System.out.println("Java8" + " - " + "Java8".matches(regex0));
        System.out.println("J9" + " - " + "J9".matches(regex0));
        System.out.println("v8" + " - " + "v8".matches(regex0));
        System.out.println(" ");
        ////
        String regex2 = "ab.?";
        String regex3 = "abc{0,1}";

        System.out.println("abc" + " - " + "abc".matches(regex2));
        System.out.println("abc" + " - " + "abc".matches(regex3));
        System.out.println(" ");
        ////
        // Квантификатор +
        String regexPlus = "ca+b";

        System.out.println("Квантификатор + :");
        System.out.println("cab" + " - " + "cab".matches(regexPlus));
        System.out.println("caaaaab" + " - " + "caaaaab".matches(regexPlus));
        System.out.println("cb" + " - " + "cb".matches(regexPlus));
        System.out.println(" ");
        // Квантификатор *
        String regexMul = "ca*b";

        System.out.println("Квантификатор * :");
        System.out.println("cab" + " - " + "cab".matches(regexMul));
        System.out.println("caaaaab" + " - " + "caaaaab".matches(regexMul));
        System.out.println("cb" + " - " + "cb".matches(regexMul));
        System.out.println(" ");
        ////

        String regexRep2 = "1{2,3}";

        System.out.println("regexRep2 :");
        System.out.println("11" + " - " + "11".matches(regexRep2));
        System.out.println("111" + " - " + "111".matches(regexRep2));
        System.out.println("1" + " - " + "1".matches(regexRep2));
        System.out.println(" ");
        ////

        String regexRep3 = "ab{4,}";

        System.out.println("regexRep3 :"); // {4,} число минимальных повторений (,) без ограничения;
        System.out.println("abb" + " - " + "abb".matches(regexRep3));
        System.out.println("abbbb" + " - " + "abbbb".matches(regexRep3));
        System.out.println("abbbbbbbb" + " - " + "abbbbbbbb".matches(regexRep3));
    }
}

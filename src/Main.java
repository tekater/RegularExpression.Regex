public class Main {
    public static void main(String[] args) {
        String regex = "ale";

        System.out.println("ale" + " - " + "ale".matches(regex));
        System.out.println(" ");
        ////
        String regex1 = "[Java][7-9]";

        System.out.println("Java :");
        System.out.println("j7" + " - " + "j7".matches(regex1));
        System.out.println("Java8" + " - " + "Java8".matches(regex1));
        System.out.println("J9" + " - " + "J9".matches(regex1));
        System.out.println("v8" + " - " + "v8".matches(regex1));
        System.out.println(" ");
        ////
        String regex0 = "[Java]{4}[7-9]";

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
        System.out.println(" ");
        ////

        String regexRep4 = "ab+a";

        System.out.println("regexRep4 : ");
        System.out.println("aa" + " - " + "aa".matches(regexRep4));
        System.out.println("aba" + " - " + "aba".matches(regexRep4));
        System.out.println("abbba" + " - " + "abbba".matches(regexRep4));
        System.out.println("abbbbba" + " - " + "abbbbba".matches(regexRep4));
        System.out.println(" ");
        ////

        String regexRep5 = "ab*a";

        System.out.println("regexRep5 : ");
        System.out.println("aa" + " - " + "aa".matches(regexRep5));
        System.out.println("aba" + " - " + "aba".matches(regexRep5));
        System.out.println("abbba" + " - " + "abbba".matches(regexRep5));
        System.out.println("abbbbba" + " - " + "abbbbba".matches(regexRep5));
        System.out.println(" ");
        ////

        String regexRep6 = "ab{0,3}a";

        System.out.println("regexRep6 : ");
        System.out.println("aa" + " - " + "aa".matches(regexRep6));
        System.out.println("aba" + " - " + "aba".matches(regexRep6));
        System.out.println("abbba" + " - " + "abbba".matches(regexRep6));
        System.out.println("abbbbba" + " - " + "abbbbba".matches(regexRep6));
        System.out.println(" ");
        ////

        String regexRep7 = "ab{3,}a";

        System.out.println("regexRep7 : ");
        System.out.println("aa" + " - " + "aa".matches(regexRep7));
        System.out.println("aba" + " - " + "aba".matches(regexRep7));
        System.out.println("abbba" + " - " + "abbba".matches(regexRep7));
        System.out.println("abbbbba" + " - " + "abbbbba".matches(regexRep7));
        System.out.println(" ");
        ////

        String regular = "[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}";

        System.out.println("regular: ");
        System.out.println("1" + " - " + "1c1a3de4-c711-4e9c-bed2-e75fd69ce920".matches(regular));
        System.out.println("2" + " - " + "ad9e03f0-4bd4-46db-k79e-94ca17d4b74f".matches(regular));
        System.out.println("3" + " - " + "f087d9fc-xyz3-4a3f-93e0-bdb8d9b68268".matches(regular));
        System.out.println("4" + " - " + "92ae7a-94f-40c-a22-de4b42dd13".matches(regular));
        System.out.println("5" + " - " + "f66024c3_50f8_442e_9387_28746581f472".matches(regular));
        System.out.println("extra" + " - " + "00000000-9999-4aaa-9fff-0123456789ff".matches(regular));
        System.out.println(" ");
        ////

    }
}

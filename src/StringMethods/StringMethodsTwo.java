package StringMethods;

import java.sql.SQLOutput;

public class StringMethodsTwo {

    public static void main(String[] args) {

        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2 ));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        // stratWith an endWith

        System.out.println("\n"+str.startsWith("j")); //          true
        System.out.println(str.startsWith(str3)); //              true
        System.out.println(str2.startsWith(str3)); //             false sensible à la case
        System.out.println(str.startsWith("J")); //               false
        System.out.println(str.startsWith("J".toLowerCase())); // true
        System.out.println(str.endsWith("va")); //                true

        // contains
        System.out.println("\n"+str.contains(str3)); //            true
        System.out.println(str.contains(str2)); //                 false sensible à la case
        System.out.println(str.contains("av")); //                 true
        System.out.println("Java".contains("j"));//                false sensible à la case
        System.out.println("Java".contains("j".toUpperCase())); // true

        // replace


    }
}

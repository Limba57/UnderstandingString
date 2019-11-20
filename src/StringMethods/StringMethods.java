package StringMethods;

import java.sql.SQLOutput;

public class StringMethods {

    public static void main(String[] args) {

        String str = "java is fun";
        // j a v a   i s   f u n
        // 0 1 2 3 4 5 6 7 8 9 10

        //lenght
        System.out.println("length = " + str.length()); // les espaces comptes

        // char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));
        // System.out.println(str.charAt(12)); // throws out of bound exeption index star at 0

        // index of
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a',2));
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("fun",10)); // -1 --> match not found

        // substring
        // str = str.substring((8));
        System.out.println(str.substring(8)); // --> fun        index 8 is in
        System.out.println(str.substring(0, 5)); // --> java_   index 0 is in but not index 5
        System.out.println(str.substring(4, 4)); // nothing is print --> empty string

        // System.out.println(str.substring(4, 2));  // out of range
        // System.out.println(str.substring(8, 14)); // out of range

        System.out.println("AbCd".toUpperCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
        dog.toUpperCase();
        System.out.println(dog);
        dog = dog.toUpperCase();
        System.out.println(dog);

    }
}

package Equality;

import java.sql.SQLOutput;

public class Equality {

    public static void main(String[] args) {

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");
        System.out.println(one == two);
        System.out.println(one == three);

        String x = "java";
        String y = "java";
        System.out.println(x == y);

        String a = "Java";
        String b = " Java".trim();
        System.out.println(a == b);

        String c = "Java";
        String d = " Ja".trim() + "va";
        System.out.println(c == d);

        String e = "java";
        String f = "ja" + "va";
        String g = "ja";
        String h = "va";
        String i = g + h;
        String j = "java";
        System.out.println("\n" + e == f);
        System.out.println(e == (g + h));
        System.out.println(e == i);
        System.out.println(e == j);

    }

}

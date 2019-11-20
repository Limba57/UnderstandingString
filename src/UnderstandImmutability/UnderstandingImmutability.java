package UnderstandImmutability;

public class UnderstandingImmutability {

    public static void main(String[] args) {

        String hello = "hello";
        String hi = hello + "word";     // helloword
        hi = hello;                     // hello
        System.out.println(hi + hello); // hellohello

        hello.toUpperCase();
        System.out.println(hello);      // hello

        hello = hello.toUpperCase();
        System.out.println(hello);      // HELLO

        // concat
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);         // 12
        s2 = s2.concat("3");
        System.out.println(s2);         // 123


    }

}

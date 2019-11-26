package MethodChaining;

public class MethodChaining {

    public static void main(String[] args) {

        String start = " Java ";

        String trimmed = start.trim();
        System.out.println("trimmed = " + trimmed);

        String lowerCase = trimmed.toLowerCase();
        System.out.println("toLowerCase = " + lowerCase);

        String result = lowerCase.replace('j', 'J');
        System.out.println("result = " + result);

        String anotherResult = " Java ".trim().toLowerCase().replace('j', 'J');
        System.out.println("anotherResult = " + anotherResult);
        System.out.println(result.equals(anotherResult));

        String a = "abc";
        String b = a.toUpperCase();
        String c = b.replace('B', 'b').replace('C', 'c');
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // exemple
        if (a.equalsIgnoreCase(b)) {
            System.out.println("String are equals");
        }

        if (a.toLowerCase().toLowerCase().trim().equals(b.toLowerCase().trim())) {
            System.out.println("String are equals too");
        }
    }
}

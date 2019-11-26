package StringBuilderMethods;

public class StringBuilderMethods {

    public static void main(String[] args) {

        // charAt, indexOf, lenght, subString
        // p r o g r a m m i n g
        // 0 1 2 3 4 5 6 7 8 9 10
        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
        int len = sb.length();
        char ch = sb.charAt(5);
        System.out.println(sub + " " + len + " " + ch);

        // append
        StringBuilder b = new StringBuilder().append(1).append('L');
        b.append("-").append(true);
        System.out.println("\n"+b);

        // insert
        // p r o g r a m m i n g
        // 0 1 2 3 4 5 6 7 8 9 10
        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "-");
        builder.insert(2, 2);
        System.out.println("\n"+builder);

        // delete deleteCharAt
        // p r o g r a m m i n g
        // 0 1 2 3 4 5 6 7 8 9 10
        StringBuilder builderDelete = new StringBuilder("programming");
        builderDelete.delete(4, 9);
        System.out.println("\n"+builderDelete);
        builderDelete.deleteCharAt(2);
        System.out.println(builderDelete);
        // builderDelete.delete(2, 1); // Throws exeption
        builderDelete.delete(1, 1); // do nothing
        System.out.println(builderDelete);


        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println("\n"+sb1);

        String myString = sb1.toString();
        myString = myString.toLowerCase();
        System.out.println(myString);

    }
}

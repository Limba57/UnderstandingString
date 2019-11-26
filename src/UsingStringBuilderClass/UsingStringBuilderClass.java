package UsingStringBuilderClass;

public class UsingStringBuilderClass {
    public static void main(String[] args) {

        String myString = "";

        for (char c = 'a'; c <= 'z'; c++) {
            myString += c; // every iteration will create a new string object
        }

        System.out.println(myString);

        // with string builder
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c); // add char to string builder, reuses string builder without creating a new object
        }

        System.out.println(sb);

        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); // start-middle
        StringBuilder anotherBuilder = builder.append("-end"); // pas de new, on pointe sur la meme reference

        System.out.println(builder);
        System.out.println(anotherBuilder);

        System.out.println(builder == anotherBuilder);
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(anotherBuilder));

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size = "+ myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());
        myBuilder = new StringBuilder(100);
        System.out.println("size = "+ myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        myBuilder.append("myNewTest");
        System.out.println("size = "+ myBuilder.length());
        System.out.println("capacity = " + myBuilder.capacity());

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("Cool");
        System.out.println(a);
        System.out.println(b);

        StringBuilder testSB = new StringBuilder("test");
        String testStr = "test";
        System.out.println(testStr.equals(testSB));
        System.out.println(testSB.equals(testStr));
        System.out.println(testStr.contains(testSB));
        
    }
}

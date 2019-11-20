package StringPoolAndStringEquality;

public class StringPoolAndStringEquality {

    public static void main(String[] args) {

        String name = "john";
        String anotherName = "john";
        String john = "jo" + "hn";
        String newName = new String("john");

        System.out.println("name == antherName --> " + (name == anotherName));
        System.out.println("name == john       --> " + (name == john));
        System.out.println("name == newName    --> " + (name == newName));

        System.out.println("\nname.equals(anotherName) --> " + name.equals(anotherName));
        System.out.println("name.equals(john)        --> " + name.equals(john));
        System.out.println("name.equals(newName)     --> " + name.equals(newName));

        System.out.println("\nname       - identityHashCode --> "+System.identityHashCode(name));
        System.out.println("anotherame - identityHashCode --> "+System.identityHashCode(anotherName));
        System.out.println("john       - identityHashCode --> "+System.identityHashCode(john));
        System.out.println("newName    - identityHashCode --> "+System.identityHashCode(newName));

        // exam exemple
        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        String str4 = "ab" + "c";
        System.out.println("str1 == str2 --> " + (str1 == str2)); // false
        System.out.println("str1 == str3 --> " + (str1 == str3)); // false --> affectation --> new hash code
        System.out.println("str1 == str4 --> " + (str1 == str4)); // true  --> concatenation
    }
}

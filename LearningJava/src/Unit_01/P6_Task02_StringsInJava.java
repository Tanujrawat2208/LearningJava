package Unit_01;

public class P6_Task02_StringsInJava
{
    public static void main(String[] args)
    {
        StringInJava obj = new StringInJava();
        obj.StringDefinition();
        obj.charAndString();
    }
}
class StringInJava
{
    void StringDefinition()
    {
        String s = "Hello There";
        String s1 = new String("My name is Tanuj Rawat");

        System.out.println(s);

        // Get the length of the String
        System.out.println("length of string s : " + s.length());

        // loop through a string
        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }

        String first = "Tushar";
        String second = "Sharma";

        // Adding two strings
        String third = first + second;
        System.out.println(third);

        // Comparing two strings
        boolean result = first.equals(second);
        System.out.println(result);

        /* Java Strings are Immutable.
         * In Java, the JVM maintains a String pool to store all of its string inside the memory.
         * The String pool helps is re-using the strings.
         * If the string is already exists, the new string is not created.
         * Instead a new reference is created, pointing to the already existing string.
         * If the string is doesn't exist, then the new string is created.
         */

        String fourth = "Tanuj";
        String fifth = new String("Rawat");
    }

    void charAndString()
    {
        System.out.println("Inside charAndString() function");

        char[] ch = {'H', 'E', 'L', 'L', 'O', ' ', 'T', 'H', 'E', 'R', 'E', '!'};
        char[] ch2 = {'!', '!'};

        System.out.println(ch);

        for (int i = 0; i < ch.length; i++)
        {
            System.out.println(ch[i]);
        }

        // char array to String.
        String s1 = new String(ch);
        System.out.println(s1);

        // Character arrays are mutable but Strings are not.
        ch[0] = 'h';
       // s1.charAt(0) = 'h'; // error

        /*
         * To join two java string, '+' can be used to append strings together to form a new string.
         * But it is not possible in char array
         */
        s1 = s1 + 'a';      // s1 is the new object with new memory

        // String to char array
        String s2 = "Graphic Era";
        char[] ch4 = s2.toCharArray();
        System.out.println(ch4);

        // char array to String
        char[] a2 = {'A', 'B', 'C'};
        String s3 = new String(a2);
        System.out.println(a2);
    }
}
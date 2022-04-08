package Unit_01;

/*
 * The Wrapper class in java provides a mechanism to convert primitive into objects and vice-versa.
 * WHY?
 * Because we want to use predefined methods of that object.
 */

public class P4_Task02_WrapperClassesInJava
{
    public static void main(String[] args)
    {
        // Converting int to Integer
        int a = 10;
        String s = "" + a + "";

        Integer i = Integer.valueOf(a);     // Converting int to Integer type explicitly
        Integer j = a;                      // Autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println("a=" + a + "\t i=" + i + "\t j=" + j);

        System.out.println(i.toString());
        // a.toString() cannot be done as a is int and not an object

        // Autoboxing -> Converting Primitive into objects
        byte b = 100;
        Byte byteobj = b;
        System.out.println("byteobj = " + byteobj);

        // Unboxing -> Converting Objects into Primitive
        byte bytevalue = byteobj;
        System.out.println("bytevalue = " + bytevalue);
    }
}
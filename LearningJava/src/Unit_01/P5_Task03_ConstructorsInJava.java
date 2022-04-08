package Unit_01;

/*
 * Constructors are when an instance of the class is created.
 * At the time of calling the constructors, memory for the object is allocated.
 * It is a special type of method which is used to initialize the object.
 * Every time an object is created using the new() keyword, at least one constructor is called
 * There are two types of constructors in java
 *      -> Default Constructor
 *      -> Parameterised Constructor
 */
public class P5_Task03_ConstructorsInJava
{
    public static void main(String[] args)
    {
        ABC4 obj = new ABC4();
        ABC4 obj1 = new ABC4(1);

        System.out.println(obj.a);
        System.out.println(obj1.a);
    }
}
class ABC4
{
    int a;
    /*
        ClassName(Constructor Parameters)
        {
            All the class and instance variables can be initialized here!
        }
     */

    ABC4()
    {
        a = 10;
    }

    ABC4(int a)
    {
        this.a = a;
    }
}
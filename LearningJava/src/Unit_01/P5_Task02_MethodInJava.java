package Unit_01;

public class P5_Task02_MethodInJava
{
    public static void main(String[] args)
    {
        ABC3 obj = new ABC3();

        // Calling display method definition
        obj.display();
        System.out.println(obj.a);
    }
}
class ABC3
{
    static int a = 100;

    /*
    Actual Method definition:
        DataType methodName(DataType2 p1, DataType2 p2)
        {
            method body;
            return value; // if required
        }
     */
    static void display()
    {
        int b = 10;
        int a = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    int display2()
    {
        System.out.println(a);
        // As 'b' was a local variable so we cannot access it outside the method.
        // System.out.println(b);

        return (a);
    }
}
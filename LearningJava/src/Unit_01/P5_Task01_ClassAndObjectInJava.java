package Unit_01;

public class P5_Task01_ClassAndObjectInJava
{
    public static void main(String[] args)
    {
        ABC2 obj = new ABC2();
        obj.display2();

        ABC2.display();
    }
}
class ABC2
{
    int a = 10;
    static  int b = 20;

    static void display()
    {
        int b = 100;
        b++;

        //System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    void display2()
    {
        System.out.println("a = " + a);
        // As 'a' was a local variable so we can not access it outside the method.
        System.out.println("b = " + b);
    }
}
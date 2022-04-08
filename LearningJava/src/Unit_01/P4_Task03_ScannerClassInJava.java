package Unit_01;

import java.util.Scanner;

/*
 * When user takes input from the console!
 * nextLine()       ->      Reads user input (to read Strings).
 * next()           ->      Reads next token from the input entered by the user.
 * nextBoolean()    ->      Reads a boolean value from the user.
 * nextByte()       ->      Reads a byte value from the user.
 * nextDouble()     ->      Reads a double value from the user.
 * nextFloat()      ->      Reads a float value from the user.
 * nextInt()        ->      Reads a int value from the user.
 * nextLong()       ->      Reads a long value from the user.
 * nextShort()      ->      Reads a short value from the user.
 */
public class P4_Task03_ScannerClassInJava
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);       // Creating a scanner object
        Scanner sc2 = new Scanner(System.in);

        // Reading the first token (____Spacebar)
        String firstName = sc.next();
        System.out.println("First Name is: " + firstName);

        String name = sc2.nextLine();
        System.out.println("Name is: " + name);

        boolean b = sc2.nextBoolean();
        System.out.println(b);

        sc.close();
        sc2.close();
    }
}
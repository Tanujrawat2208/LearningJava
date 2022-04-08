package Unit_01;

/*
 * Normally, an array is a collection of similar type of elements which has contiguous memory location.
 * Java array is an object which contains element of similar data types.
 * We can store only fixed set of elements in a Java array.
 * Size Limit Issues:
 *      -> We can store only the fixed size of elements in the array.
 *      -> It doesn't grow its size at runtime.
 *      -> To solve this problem, collection framework is used in Java which grows automatically.
 *
 * There are two types of array
 *      -> Single Dimensional Array
 *      -> Multidimensional Array
 * Declare an Array in Java
 *      -> DataType arrayRefVar[]; OR
 *      -> DataType[] arrayRefVar; OR
 *      -> DataType []arrayRefVar;
 *
 * Instantiation of an Array in Java
 *      -> arrayRefVar = new DataType[size];
 */
public class P6_Task01_ArraysInJava
{
    public static void main(String[] args)
    {
        // Declaration
        int array1[];
        int[] array2;
        int []array3;

        // Can not do it as we have not provided it any memory/space yet
        // arra1[0] = 1;

        // Initialization, We have to provide the size of the array
        array1 = new int[6];

        // Assigning values to the java array
        for(int i = 0; i < array1.length; i++)        // length is the property of the array
        {
            array1[i] = i;
        }
        // Printing java array
        System.out.print("\nArray 1 is : ");
        for (int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i] + " ");
        }

        int array4[] = {10, 20, 30, 40};              // declaration, instantiation, and initialization

        arrayAsParameter(array4);                     // Passing array to method

        arrayAsParameter(new int[]{9, 8, 7, 6, 5});   // Passing anonymous array in a method

        int []array5 = arrayAsReturnType();
        System.out.print("\nArray5 is : ");
        for (int i = 0; i < array5.length; i++)
        {
            System.out.print(array5[i] + " ");
        }

        /* // ArrayIndexOutOfBoundsException
        int arr[] = {50, 60, 70, 80};
        for (int i = 0; i <= arr.length; i++)
        {
            System.out.println(arr[i]);
        }
         */

        // MultiDimensional Array in Java
        int[][] arr6 = new int[3][3];               // 3 Rows and 3 Columns
        int counter = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                counter++;
                arr6[i][j] = counter;
            }
        }

        System.out.println("\nMultiDimensional Matrix:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arr6[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void arrayAsParameter(int arr[])
    {
        System.out.print("\nArray is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] arrayAsReturnType()
    {
        int a[] =  {99, 88, 77, 66, 55};
        return a;
    }
}
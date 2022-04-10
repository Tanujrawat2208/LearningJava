package Unit_01;
import java.util.*;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };
		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
	   int temp;
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
	       System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	}}

	void findTheDuplicateElements(int[] arr) { 
		System.out.println(" "); 
		System.out.println("Duplicate elements in given array: "); 
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) 
                    System.out.println(arr[j]);  
            }}}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		   int temp;
		   int n=arr.length;
			for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	        System.out.println("Second Largest:"+arr[n-2]);
	        System.out.println("Smallest:"+arr[0]);


	}

	void leftRotationInAnArray(int[] arr) {
	    int n=3; 
		for(int i = 0; i < n; i++){  
	            int j, first;    
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                arr[j] = arr[j+1];  
	            }  
	            arr[j] = first;  
	        }
		  System.out.println();    
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	}
	        System.out.println(" ");
}

	void removeElementInArray(int[] arr) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the position of the number which is to be deleted");
		 int  pos = sc.nextInt();
		 int i,n=arr.length;
		 for(i=pos;i<n-1;i++)
		     	{
		         arr[i]=arr[i+1];
		     }
		     n=n-1;
		     
		 System.out.println("\nOn deleting new array we get is\n");
		     for( i=0;i<n;i++) 
		     {
		         System.out.print("  arr["+i+"]="+arr[i]);
		     }
		 }
		}
	
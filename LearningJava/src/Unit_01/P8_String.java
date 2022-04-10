package Unit_01;


/* Problem Statement:
P8_String: 
(Create separate logic in separate function)
F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.
F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?
 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("75457");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int n=s.length();
		String b="";
		for(int i=n-1;i>=0;i--)
		{
		 b=b+s.charAt(i);
		}
		if(s.equalsIgnoreCase(b))
		{
			System.out.println("The String is palindrome");
		}
		else
		{
			System.out.println("the string is not palindrome");
		}

	}

	void reverseOfAString(String s) {
		int n=s.length();
		String b="";
		for(int i=n-1;i>=0;i--)
		{
		 b=b+s.charAt(i);
		}
		System.out.println(b);

	}
	
	void stringEqualOrNot(String s1,String s2) {
	if(s1.equalsIgnoreCase(s2))
		System.out.println("equal");
	else
		System.out.println("not equal");
		
	}
}
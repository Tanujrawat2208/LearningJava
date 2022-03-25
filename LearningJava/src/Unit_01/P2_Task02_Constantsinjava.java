package Unit_01;
//private:"Inside class only"
//Protected: Class+ same package
//public: Class+within the package+outside the package
//Default: No Keyword,package-private{Not outside package}
public class P2_Task02_Constantsinjava {
	//final keyword is used for assigning a constant value which will remain same throughout the program
	public static final double Pi=3.14;

	public static void main(String[] args) {
		System.out.println(Pi);
		main("Callingtheprogram");
		
		//syntax for creating new object
		//class_name variable/object name=new class_name()
		NewClass obj=new NewClass();
		obj.add(1,2);
		// Pi cannot be resolved or is not a field
		

	}
	public static void main(String args)
	{
		System.out.println(Pi);
	}
    void add(int a,int b)
    {
    	System.out.println(a+b);
    	System.out.println(Pi);
    }
}
class NewClass{
	void add(int a,int b) {
		//final double Pi=3.18 {constant value can't  be modified}
	System.out.println(a+b);
	//value of pi is imported from class P2_Task02_ConstantsInJava into the new class created
	//another way of resolving the problem is by declaring the variable globally
	//
	System.out.println(P2_Task02_Constantsinjava.Pi);
	}
}3
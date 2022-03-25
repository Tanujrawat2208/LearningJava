package Unit_01;

public class P2_Task01_KeywordsInJava {

	public static void main(String[] args) {
		//variable name
		//Syntax error on token "double", invalid VariableDeclaratorId
		//identifier can never be any keyword
		int double=20;
		
		//function name
		//Syntax error on token "new", invalid AnnotationName
		//identifier can never be any keyword
		int new() {
			
			//sysout[ctrl+space] is the shorcut key for this command
			System.out.println();
			return 0;
		}
       //keyword can never be used as object name
	//ABC cannot be resolved to a variable
     //Syntax error on token "int", delete this token 
	 ABC int=new ABC;
	 
	 //class object can be created inside main even when it's non static
	 ABC n=new ABC();
	 n.display();
	}
}
//Syntax error on token "int", Identifier expected
//class name can never be any keyword
class int{
	void display()
	{
		System.out.println("Another classs");
	}
}
class ABC{
	void display()
	{
		System.out.println("Working class");
	}
}
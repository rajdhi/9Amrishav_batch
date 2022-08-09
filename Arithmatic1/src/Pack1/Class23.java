package Pack1;

public class Class23 
{
	public Class23()  
	 {
		this(10,20,30);
		System.out.println("Default constructor");
	 }
	 public Class23(int a)  
	 {
		 this(11,12,13,14);
		System.out.println("This is one parameterized  constructor");
	 }
	 public Class23(int a, int b)  
	 {
		System.out.println("This is two parameterized  constructor");
	 }
	 public Class23(int a, int b,int c, int d)  
	 {
		 
		System.out.println("This is four parameterized  constructor");
	 }
	 public Class23(int a, int b,int c)  
	 {
		System.out.println("This is three parameterized  constructor");
	 }
	 public static void main(String[] args) 
	 {
		
	Class23 obj1=new Class23();
	Class23 obj=new Class23(123);
	Class23 obj3=new Class23(123,11);
	

	}

}

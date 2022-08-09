package Pack1;

public class class22 
{
 public class22()  
 {
	System.out.println("Default constructor");
 }
 public class22(int a)  
 {
	System.out.println("This is one parameterized  constructor");
 }
 public class22(int a, int b)  
 {
	System.out.println("This is two parameterized  constructor");
 }
 public class22(int a, int b,int c, int d)  
 {
	System.out.println("This is four parameterized  constructor");
 }
 public class22(int a, int b,int c)  
 {
	System.out.println("This is three parameterized  constructor");
 }
 public static void main(String[] args) 
 {
class22 obj=new class22(123,55,1,5);	
class22 obj1=new class22();
class22 obj2=new class22(123);
class22 obj3=new class22(123,11);
class22 obj4=new class22(123,32,11);

}
}

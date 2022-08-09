package Pack1;

public class Class24 
{
	
  public void m1()
{
	  this.m2();
	System.out.println("This is 1 methood");
	this.m3();
}
public void m2()
{
	System.out.println("This is 2 methood");
}
public void m3()
{
	System.out.println("This is 3 methood");
}
public static void main(String[] args) 
{
  Class24 obj=new Class24();
  obj.m1();

}
}

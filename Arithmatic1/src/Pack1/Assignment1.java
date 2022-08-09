package Pack1;
public class Assignment1 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is"+z);
		return z;
	}
	public int multi(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("multi result is"+a3);
		return a3;
	}
	public void div(int b1, int b2)
	{
		int b3;
		b3=b1/b2;
		System.out.println("Final result is"+b3);
		
	}
	public static void main(String[] args) 
	{
	Assignment1 ob=new Assignment1();
	int sub=ob.sub(10,2);
	int smr=ob.sum(sub,2);
	int sbr=ob.sub(smr,2);
	int mtr=ob.multi(sbr,2);
	ob.div(mtr,2);
	}
}
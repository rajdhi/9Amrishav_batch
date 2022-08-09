package Pack1;

public class Arithmatic
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

	public void multi(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("Final result is"+a3);
		
	}
	public static void main(String[] args) 
	{
	Arithmatic ob=new Arithmatic();
	int smr=ob.sum(10,2);
	int sbr=ob.sub(12,2);
	ob.multi(smr,sbr);
	}
}

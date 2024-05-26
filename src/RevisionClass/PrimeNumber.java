package RevisionClass;

public class PrimeNumber {
	
	public static void main(String[] args)
	{
		int n=11;
		boolean b=true;
		
		if(n<=1)
		{
			System.out.println("Prime number");
			b=false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.print("Not a prime number");
				b=false;
				break;
			}
		}
		if(b)
		{
			System.out.println("Prime number");
		}
	}

}

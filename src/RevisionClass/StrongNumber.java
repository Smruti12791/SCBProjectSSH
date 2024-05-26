  package RevisionClass;

public class StrongNumber {
	
	public static void main(String[] args)
	{
		
		int n=145;
		int temp=n, sum=0;
		while(n>0)
		{
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			n=n/10;
			sum=sum+fact;
		}
		if(sum==temp)
		{
			System.out.println(temp+" Is a Strong number");
		}
		else
		{
			System.out.println(temp+" Not a Strong number");
		}
	
	}

}

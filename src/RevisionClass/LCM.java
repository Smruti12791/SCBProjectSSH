package RevisionClass;

public class LCM {
	
	public static void main(String[] args)
	{
		int n1=2,n2=2,n3=0;
		n3=n1>n2?n1:n2;
		while(n3>0)
		{
		if(n3%n1==0&&n3%n2==0)
		{
			
			n3++;	
		}
		
		System.out.print(n3);
	}
		
	}
}

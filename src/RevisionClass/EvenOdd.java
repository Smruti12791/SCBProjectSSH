package RevisionClass;

public class EvenOdd {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,1,2,3,4,5};
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
					System.out.println(a[j]);
				}
			}
		}
		
	}

}

package RevisionClass;

public class MaxNumber {
	public static void main(String[] args)
	{
		int a[][]= {{2,4,5},{4,0,2},{3,9,2}};
		int max=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			
		}
		System.out.println(max);
	}

}

package RevisionClass;

public class RotateOnePositionArray {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

}

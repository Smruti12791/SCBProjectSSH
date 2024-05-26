package RevisionClass;

public class BubbleSort {
	
	public static void main(String[] args)
	{
	int a[]= {2,0,30,9,1,20};
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	bubbleSort(a);
	for(int i:a)
	{
		System.out.print(i+" ");
		}
	}
	public static void bubbleSort(int a[])
	{
		int temp=0;
	for(int i=0;i<a.length;i++)
	{
		
		for(int j=1;j<(a.length)-1;j++)
		{
			if(a[j-1]>a[j])
			{
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
	}
	}
	
}
		

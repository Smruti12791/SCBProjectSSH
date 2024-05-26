package RevisionClass;

public class ArmStrongNumber {
	
	public static void main(String[] args)
	{
		int n=130;
		int temp=n, count=0;
		int arm=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		while(n>0)
		{
			int r=n%10;
			arm=(int) (arm+Math.pow(r, count));
			n=n/10;
		}
		System.out.println(arm);
	}

}

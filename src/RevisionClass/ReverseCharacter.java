package RevisionClass;

public class ReverseCharacter {
	
	public static void main(String[] args)
	{
		String s="Smruti R B";
		String rev=" ";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			rev=c+rev;
		}
		System.out.print(rev);
	}

}

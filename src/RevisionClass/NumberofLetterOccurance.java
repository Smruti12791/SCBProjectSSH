package RevisionClass;

public class NumberofLetterOccurance {
	
	public static void main(String[] args)
	{
	String s1="Smruti is i and me and i";
	int initialCount=s1.length();
	String s2="r";
	String s3=s1.replace(s2, "");
	int finalcount=s3.length();
	int count=initialCount-finalcount;
	System.out.println(s2+" is repeated "+count+" times");
	
	}

}

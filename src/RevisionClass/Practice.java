package RevisionClass;

public class Practice {
	
	public static void main(String[] args)
	{
		
//	   String originalString="abc abc abc aaa aaa";
//	   String oldChar="a";
//	   String newChar="b";
//	   String afterModifyString= originalString.replace(oldChar, newChar);
//	   System.out.println(afterModifyString);
//	   
		
		String originalString="abc abc abc aaa";
		char[] charArray=originalString.toCharArray();
		char oldChar='a';
		char newChar='d';
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==oldChar)
			{
				charArray[i]=newChar;
			}
		}
		String modifiedString= new String(charArray);
		System.out.println(modifiedString);
	   
	}
}

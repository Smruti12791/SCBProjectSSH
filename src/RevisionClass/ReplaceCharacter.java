package RevisionClass;

public class ReplaceCharacter {
	
	public static void main(String[] args)
	{
		String originalString= "peaceee sdesse";
		String oldChar="e";
		String newChar="x";
		String newString= originalString.replace(oldChar, newChar);
		System.out.println(newString);
		
//		String OriginalString="peace sseebb";
//		char oldChar='e';
//		char newChar='x';
//		char[] charArray=OriginalString.toCharArray();
//		for(int i=0;i<charArray.length;i++)
//		{
//			if(charArray[i]==oldChar)
//			{
//				charArray[i]=newChar;
//			}
//		}
//		String modifedString= new String(charArray);
//		System.out.println(modifedString);
		
	}

}

package RevisionClass;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scn.nextInt();
		if(num%400==0 || num%4==0&&num%100!=0)
		{
			System.out.print("29 days");
		}
		else
		{
			System.out.println("28 days");
		}
	}

}

package com;
import java.util.Scanner;
public class RemoveDuplicate {
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str =s.next();
		String ans="";
		int i=1;
	if(str.charAt(0)!=str.charAt(1))
	{
		ans=ans+str.charAt(0);
	}
	for(i=1;i<str.length()-1;i++)
	{
		if(str.charAt(i)!=str.charAt(i-1) && str.charAt(i)!=str.charAt(i+1))
		{
			ans=ans+str.charAt(i);
		}
	}
	if(str.charAt(i)!=str.charAt(i-1))
	{
		ans=ans+str.charAt(i);
	}
	System.out.println("String after removing duplicates is "+ans);		
  }
}

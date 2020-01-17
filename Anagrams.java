package com;
import java.util.*;
public class Anagrams 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String a;
		String b;
		a=s.next();
		b=s.next();
		check_Anagram(a,b);
	}
public static void check_Anagram(String a ,String b)
{
	int flag=0;
	int n=a.length();

	char arr1[]= a.toCharArray();
	char arr2[]= b.toCharArray();	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	for(int i=0;i<n;i++)
	{
		if(arr1[i]==arr2[i])
		{
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
	}
	
	if(flag==1)
	{
		System.out.println("Anagrams");
	}
	else
	{
		System.out.println("Not Anagrams");
	}
	
	}
}
package com;
import java.util.*;
public class leaders_in_array {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,j;
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i< n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Output :");
		for(int i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]<=arr[j])
				{
					break;
				}
			}
			if(j == n)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

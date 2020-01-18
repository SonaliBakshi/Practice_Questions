package com;
import java.util.*;
public class PythagoreanTriplet {
	public static boolean checkTriplet(int arr[],int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((arr[i]*arr[i])+(arr[j]*arr[j])==arr[k]*arr[k])
					{
						return true;
					}
						
				}
			}
		}
	
		return false;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	int t,n;
	System.out.println("Enter the number of testcase");
	t=s.nextInt();
	for(int j=0;j<t;j++)
	{
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		if(checkTriplet(arr,n))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
  }
}

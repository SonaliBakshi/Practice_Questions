package com;
import java.util.*;
public class Second_Largest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
				
		Arrays.sort(arr);
		System.out.println("Largest -" +arr[n-1]);
		System.out.println("Second -" + arr[n-2]);
	}

}

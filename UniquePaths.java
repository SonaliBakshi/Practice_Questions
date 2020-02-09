package com;
import java.util.*;
public class UniquePaths {

	    static int numberOfPaths(int arr[][]) 
	    { 
	    	 int m=arr.length;
			 int n=arr[0].length; 
	        int count[][] = new int[m][n]; 
	        for (int i = 0; i < m; i++) 
	        {
	            count[i][0] = 1; 
	        }
	        for (int j = 0; j < n; j++) 
	        {
	            count[0][j] = 1; 
	        }
	        for (int i = 1; i < m; i++)
	        { 
	            for (int j = 1; j < n; j++) 
	                count[i][j] = count[i - 1][j] + count[i][j - 1] ; 
	        } 
	        return count[m - 1][n - 1]; 
	    } 
	    public static void main(String args[]) 
	    { 
	      	Scanner s=new Scanner (System.in);
	    	System.out.println("Enter the number of rows");
	    	int r=s.nextInt();
	    	System.out.println("Enter the number of columns");
	    	int c=s.nextInt();
	    	System.out.println("enter the array");
	    	int arr[][]= new int [r][c];
	    	for(int i=0;i<r;i++)
	    	{
	    		for(int j=0;j<c;j++)
	    		{
	    			arr[i][j]=s.nextInt();
	    		}
	    	}
	        System.out.println(numberOfPaths(arr)); 
	    } 
	
	 
}

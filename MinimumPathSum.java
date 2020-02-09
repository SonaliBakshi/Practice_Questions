package com;
import java.util.*;
public class MinimumPathSum {
		    public static int minPathSum(int[][] grid) {	
		    int r=grid.length;
		    int c=grid[0].length; 
		        int[][] arr=new int[r][c];
		        
		        		arr[0][0]=grid[0][0];
		        		//for rows
		        for(int i=1;i<r;i++)
		        	{
		        	arr[i][0]=arr[i-1][0]+grid[i][0];
		        	}
		        //for columns
		        for(int j=1;j<c;j++)
		        	{
		        	arr[0][j]=arr[0][j-1]+grid[0][j];
		        	}
		        
		        for(int i=1;i<r;i++)
		        
		        {
		            for(int j=1;j<c;j++)
		            {
		                arr[i][j]=Math.min(arr[i-1][j],arr[i][j-1])+grid[i][j];
		            }
		        }
		        return arr[r-1][c-1];
		    }
		    public static void main(String args[])
			{
		       	Scanner s=new Scanner (System.in);
		    	System.out.println("Enter the number of rows");
		    	int rows=s.nextInt();
		    	System.out.println("Enter the number of columns");
		    	int cols=s.nextInt();
		    	int arr[][]=new int[rows][cols];	
		    	if(rows==0 || cols==0)
		    	{
		    		System.out.println("sorry");
		    	}	
		    	else {
		    		System.out.println("Enter the array");
		    	for(int i=0;i<rows;i++)
		    	{
		    		for(int j=0;j<cols;j++)
		    		{
		    			arr[i][j]=s.nextInt();
		    		}
		    	}
		    	int n=minPathSum(arr);
		    	System.out.println(n);
		    	}
			}
}
 
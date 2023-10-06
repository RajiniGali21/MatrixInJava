package com.kn.MatrixAdditon;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int[][] arr = new int[3][3];
	int[][] brr = new int[3][3];
	System.out.println("enter the elements of the first array = ");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter the elements of the second array = ");
	for(int i=0;i<brr.length;i++)
	{
		for(int j=0;j<brr[i].length;j++)
		{
			brr[i][j]=sc.nextInt();
		}
	}
	findMultiplication(arr,brr);
	sc.close();
	
	}

	public static void findMultiplication(int[][] arr, int[][] brr) {
		int[][] crr = new int[3][3];
		System.out.println("Matrix Multiplication");
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++)
			{
				crr[i][j]=0;
				for(int k=0;k<crr[i].length;k++)
				{
					crr[i][j]=crr[i][j]+arr[i][k]*brr[k][j];
				}
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

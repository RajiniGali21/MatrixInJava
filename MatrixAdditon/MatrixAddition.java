package com.kn.MatrixAdditon;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size = ");
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		int[][] brr = new int[sc.nextInt()][sc.nextInt()];
		System.out.println("enter the elements = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements are = ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print("["+" "+arr[i][j]+" "+"]");
			}
			System.out.println();
		}
		
		System.out.println("enter the brr elements = ");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements are = ");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[0].length;j++)
			{
				System.out.print("["+" "+brr[i][j]+" "+"]");
			}
			System.out.println();
		}
		
		System.out.println("addition of two matrixes = ");
		
		int[][] crr = new int[arr.length][arr[0].length];

		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++)
			{
				 crr[i][j]=arr[i][j]+brr[i][j];
				 System.out.print("["+" "+crr[i][j]+" "+"]");
			}
			System.out.println();
		}
		sc.close();
	}

}

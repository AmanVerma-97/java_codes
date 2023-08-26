/*
    Row Wise Sum

    For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the 
    row elements in a single line, separated by a single space.
    Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
    Then the test cases follow.

    First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. 
    They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

    Second line onwards, the next 'N' lines or rows represent the ith row values.

    Each of the ith row constitutes 'M' column values separated by a single space.

    Output Format :
    For each test case, print the sum of every ith row elements in a single line separated by a single space.

    Output for every test case will be printed in a seperate line.

    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    0 <= M <= 10^3
    Time Limit: 1sec

    Sample Input 1:
    1
    4 2 
    1 2 
    3 4 
    5 6 
    7 8
    Sample Output 1:
    3 7 11 15 

*/

import java.util.*;

public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {
        
		for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[i].length;j++)
            {
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
	}

    public static void main(String args[]) 
    {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
        {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[i][j]=sr.nextInt();
                }
            }
            
            rowWiseSum(ar);
        }
        sr.close();
    }
}

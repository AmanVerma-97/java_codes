/*
    Total Sum on the Boundaries and Diagonals

    For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both 
    the diagonals and at all the four boundaries.

    Input format:
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
    Then the test cases follow.
    First line of each test case or query contains a single integer value, 'N' representing the 
    'rows' and 'columns' for the two-dimensional square matrix.
    Second line onwards, the next 'N' lines or rows represent the ith row values.
    Each of the ith row constitutes 'N' column values separated by a single space.

    Output format:
    For each test case, print the single integer denoting the sum.

    Output for every test case will be printed in a seperate line.

    Constraints:
    1 <= t <= 10^2
    0 <= N <= 10^3
    Time Limit: 1sec

    Sample input 1:
    1
    3
    1 2 3
    4 5 6
    7 8 9
    Sample Output 1:
    45

    Explanation for Sample Output 1:
    The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

    The first-diagonal elements are 1, 5 and 9. 

    The second-diagonal elements are 3, 5 and 7.

    We just need to add all these numbers making sure that no number is added twice. 
    For example, '1' is both a boundary element and a first-diagonal element similarly, 
    '5' contributes to both the diagonals but they won't be added twice.

    Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
*/


import java.util.*;

public class PrintBoundriesAndDiagonalSum {

    public static void totalSum(int[][] mat) {
		int sum=0;
        int row=mat.length;
        int col=0;
        if(row>0)
            col=mat[0].length;
        for(int i=0;i<row;i++)
        {   int n=0;
            for(int j=0;j<col;j++)
            {
                if(i==j)                       //top-left to bottom-right digonal
                    sum+=mat[i][j];
                
                else if(i+j==row-1 && i!=j)    //top-right to bottom-left diagonal
                    sum+=mat[i][j];
                
                else if(i==0 && i!=j)          //first row except [0][0].
                    sum+=mat[i][j];
                
                else if(i==row-1 && i!=j)      //last row except [N-1][N-1].
                    sum+=mat[i][j];
                
                else if(i!=0 && i!=row-1)      //all boundary column values except first and last row.
                {
                    if(n==0)
                    {
                        sum+=mat[i][0];
                        sum+=mat[i][col-1];
                        n++;
                    }
                }
            }
        }
        System.out.println(sum);
	}
    public static void main(String args[]) {
        int t, N;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            totalSum(ar);
        }
        sr.close();
    }
}

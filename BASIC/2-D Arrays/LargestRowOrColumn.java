/*
    Largest Row or Column

    For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column 
    has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.

    Note :If there are more than one rows/columns with maximum sum, consider the row/column that comes first.
    And if ith row and jth column has the same largest sum, consider the ith row as answer.

    Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
    Then the test cases follow.
    First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. 
    They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
    Second line onwards, the next 'N' lines or rows represent the ith row values.
    Each of the ith row constitutes 'M' column values separated by a single space.

    Output Format :
    For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
    OR
    If column sum is maximum, then print: "column" <col_index> <col_sum>
    It will be printed in a single line separated by a single space between each piece of information.

    Output for every test case will be printed in a seperate line.
    Consider :
    If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.

    Constraints :
    1 <= t <= 10^2
    1 <= N <= 10^3
    1 <= M <= 10^3
    Time Limit: 1sec

    Sample Input 1:
    1
    3 2
    6 9 
    8 5 
    9 2 
    Sample Output 1:
    column 0 23

*/


import java.util.*;

public class LargestRowOrColumn {

    public static void findLargest(int mat[][]){
		int largestCol=Integer.MIN_VALUE;
        int largestRow=Integer.MIN_VALUE;
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++)
        {
            int sumRow=0;
            for(int j=0;j<mat[0].length;j++)
            {
                sumRow+=mat[i][j];
            }
            if(sumRow>largestRow)
            {
                largestRow=sumRow;
                row=i;
            }
        }
        if(mat.length>0)
        {for(int i=0;i<mat[0].length;i++)
        {
            int sumCol=0;
            for(int j=0;j<mat.length;j++)
            {
                sumCol+=mat[j][i];
            }
            if(sumCol>largestCol)
            {
                largestCol=sumCol;
                col=i;
            }
        }}
        if(largestCol>largestRow)
            System.out.print("column "+col+" "+largestCol);
        else if(largestRow>largestCol)
            System.out.print("row "+row+" "+largestRow);
        else if(largestCol==largestRow)
            System.out.print("row "+row+" "+largestRow);
           
	}

    public static void main(String args[]) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
		{
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) 
			{
                for (int j = 0; j < m; j++) 
				{
                    ar[i][j] = sr.nextInt();
                }
            }
            findLargest(ar);
            sr.close();
        }
    }
}

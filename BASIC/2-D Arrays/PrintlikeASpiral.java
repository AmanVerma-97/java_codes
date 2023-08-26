/*
    Print Spiral

    For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. 
    That is, you need to print in the order followed for every iteration:

    a. First row(left to right)
    b. Last column(top to bottom)
    c. Last row(right to left)
    d. First column(bottom to top)

    Mind that every element will be printed only once.

    Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
    Then the test cases follow.
    First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. 
    They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
    Second line onwards, the next 'N' lines or rows represent the ith row values.
    Each of the ith row constitutes 'M' column values separated by a single space.

    Output format :
    For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

    Output for every test case will be printed in a seperate line.
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    0 <= M <= 10^3
    Time Limit: 1sec

    Sample Input 1:
    1
    4 4 
    1 2 3 4 
    5 6 7 8 
    9 10 11 12 
    13 14 15 16
    Sample Output 1:
    1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
*/

//We'll just handle the function

public class PrintlikeASpiral {

    public static void spiralPrint(int matrix[][]){
		
		int row=matrix.length;
		if(row==0)
		{
			return;
		}
		int col=matrix[0].length;
		int left=0;
		int right=col-1;
		int top=0;
		int bottom=row-1;
		int direction=0;
		int arrsize=row*col;
		int total=0;
		while(left<=right && top<=bottom)
		{
			if(direction==0)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(matrix[top][i]+" ");
					total++;
				}
				if(total==arrsize)
				{
					return;
				}
				direction=1;
				++top;
			}
			if(direction==1)
			{
				for(int i=top;i<=bottom;i++)
				{
					System.out.print(matrix[i][right]+" ");
					total++;
				}
				if(total==arrsize)
				{
					return;
				}
				direction=3;
				--right;
			}
			if(direction==3)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(matrix[bottom][i]+" ");
					total++;
				}
				if(total==arrsize)
				{
					return;
				}
				direction=4;
				--bottom;
			}
			if(direction==4)
			{
				for(int i=bottom;i>=top;i--)
				{
					System.out.print(matrix[i][left]+" ");
					total++;
				}
				if(total==arrsize)
				{
					return;
				}
				direction=0;
				left++;
			}
		}
	}
}

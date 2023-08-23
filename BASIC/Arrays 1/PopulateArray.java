/*
    Arrange Numbers In Array

    You have been given an empty array(ARR) and its size N. The only input taken from the user will be N 
    and you need not worry about the array.
    Your task is to populate the array using the integer values in the range 1 to N(both inclusive) 
    in the order - 1,3,5,.......,6,4,2.

    Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    The first and the only line of each test case or query contains an integer 'N'.

    Output Format :
    For each test case, print the elements of the array/list separated by a single space.

    Output for every test case will be printed in a separate line.
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^4

    Time Limit: 1sec

    Sample Input 1 :
    1
    6
    Sample Output 1 :
    1 3 5 6 4 2
    Explanation of Sample Input 1 :
    Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index,
    then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.
*/


import java.util.Scanner;

public class PopulateArray {
    public static void arrange(int[] arr, int n) {
        
        int i=0;
        int last=0;
    	if(n%2==0)
         last=n;
        else
         last=n-1;
        
        for(int j=1;j<=n;j=j+2)
        {
            arr[i]=j;
            i++;
        }
        for(int j=last;j>0;j=j-2)
        {
            arr[i]=j;
            i++;
        }
          
        for(int j=0;j<n;j++)
        {
            //System.out.print(arr[j]+" ");
        }
        System.out.println();
        return;
    }
    
    public static void main(String[] args)
    {
    
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int N=sc.nextInt();
            int[] arr=new int[N];
            arrange(arr,N);
        }
        sc.close();
    }
}

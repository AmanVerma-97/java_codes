/*
  Return Array Sum

    Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
    Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    The first line of each test case or query contains an integer 'N' representing the size of the array/list.
    Second line contains 'N' single space separated integers representing the elements in the array/list.

    Output Format :
    For each test case, print the sum of the numbers in the array/list.

    Output for every test case will be printed in a separate line.
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5

    Time Limit: 1sec

    Sample Input 1:
    1
    3
    9 8 9
    Sample Output 1:
    26
*/


import java.util.Scanner;

public class ArraySum {
    public static int sum(int[] arr) {
		//Your code goes here
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
	}
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int N=sc.nextInt();
            int arr[]=new int[N];
            for(int j=0;j<N;j++)
            {
                arr[i]=sc.nextInt();
            }
            int sum=sum(arr);
            System.out.println(sum);
        }
        sc.close();
    }
}

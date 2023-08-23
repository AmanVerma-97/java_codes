/*
    Sort 0 1

    You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. 
    Write a function to sort this array/list. Think of a solution which scans the array/list only ONCE 
    and don't require use of an extra array/list.

    Note: You need to change in the given array/list itself. Hence, no need to return or print anything. 

    Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
    Then the test cases follow.
    First line of each test case or query contains an integer 'N' representing the size of the array/list.
    Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.

    Output format :
    For each test case, print the sorted array/list elements in a row separated by a single space.

    Output for every test case will be printed in a separate line.
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    Time Limit: 1 sec

    Sample Input 1:
    1
    7
    0 1 1 0 1 0 1
    Sample Output 1:
    0 0 0 1 1 1 1
*/


import java.util.Scanner;

public class Sort_0_1 {
    public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            sortZeroesAndOne(arr);
             for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
           
            t -= 1;
        }
        sr.close();
    }

    public static void sortZeroesAndOne(int[] arr) {
    	int end=arr.length-1;
        int start=0;
        while(start<end)
        {
            if(arr[start]==0 && arr[end]==1)
            {
                start++;
                end--;
            }
            else if(arr[start]==1 && arr[end]==1)
            {
                end--;
            }
            else if(arr[start]==0 && arr[end]==0)
            {
                start++;
            }
            else if(arr[start]==1 && arr[end]==0) //swap when 1 is on left nad 0 is on right side in array.
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
	}
}

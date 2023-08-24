/*
    Code Merge Two Sorted Arrays

    You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, 
    merge them into a third array/list such that the third array is also sorted.

    Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. 
    Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the first array/list.

    Second line contains 'N' single space separated integers representing the elements of the first array/list.

    Third line contains an integer 'M' representing the size of the second array/list.

    Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
    Output Format :
    For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

    Output for every test case will be printed in a separate line.
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    0 <= M <= 10^5
    Time Limit: 1 sec 

    Consider the case when size of the two arrays is not same.
    Sample Input 1 :
    1
    5
    1 3 4 7 11
    4
    2 4 6 13
    Sample Output 1 :
    1 2 3 4 4 6 7 11 13 

*/

import java.util.*;
public class MergeTwoSortedArray {
    public static int[] merge(int arr1[], int arr2[]) {
        int len1=arr1.length;
        int len2=arr2.length;
    	int size=len1+len2;
        int[] finalArray=new int[size];
        int n=0;
        int i=0;
        int j=0;
        for(;i<len1 && j<len2;)
        {
            if(arr1[i]<arr2[j])
            {
                finalArray[n]=arr1[i];
                i++;
                n++;
            }
            else
            {
                finalArray[n]=arr2[j];
                j++;
                n++;
            }
        }
        while(i<len1)
        {
            finalArray[n]=arr1[i];
            i++;
            n++;
        }
        while(j<len2)
        {
            finalArray[n]=arr2[j];
            j++;
            n++;
        }
        return finalArray;
    }


    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
		    int n = sc.nextInt();
		    int[] arr1 = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr1[i] = sc.nextInt();
		    }
		    int m = sc.nextInt();
		    int[] arr2 = new int[m];
		    for(int i=0;i<m;i++)
		    {
		        arr2[i] = sc.nextInt();
		    }
		    int[] ans = new int[m+n];
		    ans = merge(arr1, arr2);
            for(int i=0;i<m+n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            t-=1;
		}
        sc.close(); 
    }
}

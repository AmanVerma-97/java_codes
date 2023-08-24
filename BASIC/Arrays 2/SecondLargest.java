/*
    Second Largest in array

    You have been given a random integer array/list(ARR) of size N. You are required to find and return 
    the second largest element present in the array/list.

    Input format :
    The first line contains an integer 'N' representing the size of the array/list.
    The second line contains 'N' single space separated integers representing the elements in the array/list.

    Output Format :
    Return the second largest element in the array/list.

    Constraints :
    0 <= N <= 10^2
    1<=arr[i]<=10^3

    Time Limit: 1 sec
    Sample Input 1:
    5
    4 3 10 9 2
    Sample Output 1:
    9

*/


import java.util.*;

public class SecondLargest {
    public static int secondLargestElement(int[] arr,int n) {
        
        if(arr.length<=1)
           return Integer.MIN_VALUE;
       
       int largest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;
       
       for(int i=0;i<arr.length;i++)
       {
           largest=Math.max(largest, arr[i]); //calculating largest
       }
       
        for(int i=0;i<arr.length;i++)
       {
           if(arr[i]!=largest)
           {
               secondLargest=Math.max(secondLargest, arr[i]); //calculating largest other than largest calculated earlier = secondlargest
           }
       }
       return secondLargest;
   }

   public static void main(String[] args) 
	{
	    Scanner sr = new Scanner(System.in);
	    int n=sr.nextInt();
	    int ar[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        ar[i]= sr.nextInt();
	    }
	    int ans = secondLargestElement(ar,n);
	    System.out.println(ans);
        sr.close();
	}
}

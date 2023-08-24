/*
    Code Binary Search

    You are given an integer array 'A' of size 'N', sorted in non-decreasing order. 
    You are also given an integer 'target'.

    Your task is to write a function to search for 'target' in the array 'A'. 
    If it exists, return its index in 0-based indexing. Otherwise, return -1.

    Note: You must write an algorithm whose time complexity is O(logN).

    Example:
    Input: ‘N’ = 7 ‘target’ = 3
    ‘A’ = [1, 3, 7, 9, 11, 12, 45]

    Output: 1

    Explanation: For A = [1, 3, 7, 9, 11, 12, 45],
    The index of element '3' is 1.
    Hence, the answer is '1'.

*/


import java.util.*;
public class BinarySearch {

    public static int search(int[] arr, int x) {
    	int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            int mid=(start+end)/2;
            if(start>end)
            {
                break;
            }
            else if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                end=mid-1;
                continue;
            }
            else
            {
                start=mid+1;
                continue;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();
        int result = search(arr, x);
        System.out.print(result);
        s.close();
    }
}

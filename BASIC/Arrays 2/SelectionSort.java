/*
    Selection Sort

    Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.

    Note: Change in the input array/list itself. 

    Example:
    Input:
    N = 5
    arr = {8, 6, 2, 5, 1}

    Output:
    1 2 5 6 8 
    Explanation: add-image

    Input format :
    First line contains an integer 'N' representing the size of the array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.
    Output format :
    The output contains the integers of the sorted array, separated by a single space.
    Note:- You don’t need to print anything. Just implement the given function.

    Sample Input 1:
    6
    2 13 4 1 3 6 
    Sample Output 1:
    1 2 3 4 6 13 
*/

// We are just sorting an unsorted array, not taking input .


public class SelectionSort {
    public static void selectionSort(int[] arr) { //After 1st traversal, smallest element will be places at first index and so on.
    	for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {   
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }   
}

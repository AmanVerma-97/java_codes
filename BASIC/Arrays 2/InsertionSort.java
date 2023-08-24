/*
    Code Insertion Sort

    You are given an integer array 'arr' of size 'N'.

    You must sort this array using 'Insertion Sort' recursively.

    Note: Change in the input array itself. You don't need to return or print the elements.

    Example:
    Input: ‘N’ = 7
    'arr' = [2, 13, 4, 1, 3, 6, 28]

    Output: [1 2 3 4 6 13 28]

    Explanation: After applying insertion sort on the input array, the output is [1 2 3 4 6 13 28].

    Input format :
    The first line contains an integer 'N' representing the size of the array.
    The second line contains 'N' single space-separated integers representing the elements of the array.

    Output Format :
    Print the array elements in sorted order, separated by a single space.

    Sample Input 1:
    5
    9 3 6 2 0
    Sample Output 1:
    0 2 3 6 9
*/

// We are just sorting an unsorted array, not taking input .


public class InsertionSort {
    //Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.
    public static void insertionSort(int[] arr) {
    	for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

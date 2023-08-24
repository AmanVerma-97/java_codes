/*
    Code Bubble Sort

    You are given an integer array 'arr' of size 'N'.

    You must sort this array using 'Bubble Sort'.

    Note: Change in the input array itself. You don't need to return or print the elements.

    Example:
    Input: ‘N’ = 7
    'arr' = [2, 13, 4, 1, 3, 6, 28]

    Output: [1 2 3 4 6 13 28]

    Explanation: After applying bubble sort on the input array, the output is [1 2 3 4 6 13 28].

    Input format :
    The first line contains an integer 'N' representing the size of the array.
    The second line contains 'N' single space-separated integers representing the elements of the array.

    Output format :
    The output contains the array elements after the sorting.

    Sample Input 1:
    7
    2 13 4 1 3 6 28
    Sample Output 1:
    1 2 3 4 6 13 28

*/

// We are just sorting an unsorted array, not taking input .


public class BubbleSort {
    public static void bubbleSort(int[] arr){ //After 1st traversal, largest element will be places at last index and so on.
    	int last=0;
        for(int i=0;i<arr.length;i++)
        {   
            last++;
            for(int j=0;j<arr.length-last;j++)
            {
                if(arr[j]<arr[j+1])
                    continue;
                else
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}

/*
    Intersection of Two Arrays II

    You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
    You need to print their intersection; An intersection for this problem can be defined when 
    both the arrays/lists contain a particular value or to put it in other words, 
    when there is a common value that exists in both the arrays/lists.

    Note : Input arrays/lists can contain duplicate elements.
    The intersection elements printed would be in the order they appear in the first array/list(ARR1).

    Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
    First line of each test case or query contains an integer 'N' representing the size of the first array/list.
    Second line contains 'N' single space separated integers representing the elements of the first the array/list.
    Third line contains an integer 'M' representing the size of the second array/list.
    Fourth line contains 'M' single space separated integers representing the elements of the second array/list.

    Output format :
    For each test case, print the intersection elements in a row, separated by a single space.

    Output for every test case will be printed in a separate line.
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    0 <= M <= 10^3
    Time Limit: 1 sec 

    Sample Input 1 :
    2
    6
    2 6 8 5 4 3
    4
    2 3 4 7 
    2
    10 10
    1
    10
    Sample Output 1 :
    2 4 3
    10
*/


import java.util.Scanner;

public class IntersectionOfArray {   
    public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr1=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr1[i]=sr.nextInt();
            }
            int m =sr.nextInt();
            int[] arr2=new int[m];
            for (int i =0 ; i<m;i++)
            {
                arr2[i]=sr.nextInt();
            }
            intersections(arr1, arr2);
            System.out .println();
            t -= 1;
        }
        sr.close();
    }

    public static void intersections(int arr1[], int arr2[]) {
        
        int len1=arr1.length;
        int len2=arr2.length;
        for(int i=0;i<len1;i++)
        {
            for(int j=0;j<len2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr2[j]+" ");
                    //arr1[i]=-1;
                    arr2[j]=-1; //because values are in range 0-M, so -1 is used to indicate 'already visited & matched' values.
                    break;
                }
            }
        }
        
    }
}

/*
    Number of Digits

    You are given a number 'n'.
    Return number of digits in ‘n’.

    Example:
    Input: 'n' = 123

    Output: 3

    Explanation:
    The 3 digits in ‘123’ are 1, 2 and 3. 

    Input format:
    The first line of input contains an integer ‘n’.

    Output Format:
    Return an integer as described in the problem statement. 

    Note
    You don’t need to print anything, it has already been taken care of, just complete the given function.
    Sample Input 1:
    121

    Sample Output 1:
    3

    Explanation of sample output 1:
    There are 3 digits in 121 are 1,2 and 1.

*/

import java.util.Scanner;

public class CountDigits{
    public static int count(int n){
		
        if(n==0)
            return 0;
        int smallOutput=count(n/10);
        int output=++smallOutput;
        return output;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(count(n));
        s.close();
	}
}
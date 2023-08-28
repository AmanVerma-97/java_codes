package Strings;

/*
    Highest Occuring Character

For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'

Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.

Consider: Assume all the characters in the given string to be in lowercase always.

Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 

Note: You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b

*/

import java.util.*;

public class HighestOccuringCharcter {
    public static char highestOccuringChar(String str) {
		int highestCount=Integer.MIN_VALUE;
        char ch='0';
        int[] hash=new int[256];
        for(int i=0;i<str.length();i++)
        {
            hash[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(hash[i]>highestCount)
            {
                highestCount=hash[i];
                ch=(char)(i);
            }
        }
        return ch;
	}

    public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char ans = highestOccuringChar(str);
		System.out.println(ans);
		sr.close();
	}
}

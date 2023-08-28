package Strings;

/*
    Compress the String

    Write a program to do basic string compression. For a character which is consecutively repeated more than once, 
    replace consecutive duplicate occurrences with the count of repetitions.

    Example:
    If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".
    The string is compressed only when the repeated character count is more than 1.

    Note: Consecutive count of every character in the input string is less than or equal to 9. 
    You are not required to print anything. It has already been taken care of. 
    Just implement the given function and return the compressed string.

    Input Format:
    The first and only line of input contains a string without any leading and trailing spaces.
    Output Format:
    The output contains the string after compression printed in single line

    Constraints:
    0 <= N <= 10^6

    Where 'N' is the length of the input string.

    Time Limit: 1 sec
    Sample Input 1:
    aaabbccdsa
    Sample Output 1:
    a3b2c2dsa
    Explanation for Sample Output 1:
    In the given string 'a' is repeated 3 times, 'b' is repeated 2 times, 'c' is repeated 2 times and 'd', 's' and 'a' 
    and occuring 1 time hence no compression for last 3 characters.

*/

import java.util.*;

public class CompressString {
    public static String getCompressedString(String str) {
        String finalString="";
        if(str.length()==0)
            return finalString;  
        for(int i=0;i<str.length();)
        {
           finalString+=str.charAt(i);
           int count=1;
           for(int j=i+1;j<str.length();j++)
           {
               if(str.charAt(j)==str.charAt(i))
                   count++;
               else
                   break;
           }  
            
           i=i+count;
           if(count>1)
              finalString+=count;                            
        }                                    
        return finalString;                                        
	}

    public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = getCompressedString(str);
		System.out.println(ans);
		sr.close();
	}
}

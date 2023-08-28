package Strings;

/*
    Reverse Each Word

Aadil has been provided with a sentence in the form of a string as a function parameter. 
The task is to implement a function so as to print the sentence such that each word in the sentence is reversed. 
A word is a combination of characters without any spaces.

Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".

Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second

Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
*/


import java.util.*;

public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        int start=0;
        int end=0;
        String finalString="";
		for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                start=i-1;
                for(int j=start;j>=end;j--)
                    finalString+=Character.toString(str.charAt(j));
                
                end=i+1;
                finalString+=" ";
            }
            else if(i==str.length()-1)
            {
                start=i;
                for(int j=start;j>=end;j--)
                    finalString+=Character.toString(str.charAt(j));
            }
        }
        return finalString;
	}

    public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = reverseEachWord(str);
		System.out.println(ans);
        sr.close();
		
	}
}

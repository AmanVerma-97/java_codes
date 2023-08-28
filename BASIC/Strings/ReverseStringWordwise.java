package Strings;



/*
    Reverse String Wordwise

    Reverse the given string word wise. That is, the last word in given string should come at 1st place, 
    last second word at 2nd place and so on. Individual words should remain as it is.

    Input format :
    String in a single line

    Output format :
    Word wise reversed string in a single line

    Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.

    Sample Input 1:
    Welcome to Coding Ninjas
    Sample Output 1:
    Ninjas Coding to Welcome

*/


import java.util.Scanner;

public class ReverseStringWordwise {
    public static String reverseWordWise(String input) {
		String reverseStr="";
		int end=input.length();
		int start;
		for(int i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)==' ') //this means a word ended from end.
			{
				start=i+1;
				reverseStr+=input.substring(start,end);
				reverseStr+=" ";
				end=i;
			}
			else if(i==0) //when it reaches first letter of first word in original string.
			{
				start=i;
				reverseStr+=input.substring(start,end);
			}
		}
		return reverseStr;
	}

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
        s.close();
	}
}

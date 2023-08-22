/*
    Fibonacci Number

    Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of 
    fibonacci series else false.
    Fibonacci Series is defined by the recurrence
        F(n) = F(n-1) + F(n-2)
    where F(0) = 0 and F(1) = 1


    Input Format :
    Integer N
    Output Format :
    true or false
    Constraints :
    0 <= n <= 10^4

    Sample Input 1 :
    5
    Sample Output 1 :
    true

    Sample Input 2 :
    14
    Sample Output 2 :
    false    
*/

import java.util.*;
public class FibonacciNumber {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.close();
		System.out.println(checkMember(n));
	}
    public static boolean checkMember(int n){
				
		if(n==0 || n==1){
            return true;
        }
        int res=0;
        int num1=0;
        int num2=1;
        for(int i=0;i<=n;i++){
           res=num1+num2;
           num1=num2;
           num2=res;
           if(n==res)
               return true;
        }
        return false;
	}
}

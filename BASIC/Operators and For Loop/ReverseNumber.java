/*
 Reverse of a number

    Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
    Note : If a number has trailing zeros, then its reverse will not include them. For e.g., 
    reverse of 10400 will be 401 instead of 00401.

    Input format :
    Integer N
    Output format :
    Corresponding reverse number
    Constraints:
    0 <= N < 10^8

    Sample Input 1 :
    1234
    Sample Output 1 :
    4321
*/

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        int value=0;
        sc.close();
        while(num>0){
            value=num%10;
            res=(res*10)+value;
            num=num/10;
        }
        System.out.print(res);
    }
}

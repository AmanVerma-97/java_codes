/*
  Binary to decimal

    Given a binary number as an integer N, convert it into decimal and print.
    Input format :
    An integer N in the Binary Format
    Output format :
    Corresponding Decimal number (as integer)
    Constraints :
    0 <= N <= 10^9

    Sample Input 1 :
    1100
    Sample Output 1 :
    12 
*/

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        int value=0;
        int i=1;
        sc.close();
        while(num>0){
            value=num%10;
            value*=i;
            res+=value;
            num=num/10;
            i=i*2;
        }
        System.out.print(res);
    }
}

/*
  Decimal to Binary

    Given a decimal number (integer N), convert it into binary and print.
    Note: The given input number could be large, so the corresponding binary number can exceed the integer range. 
    So you may want to take the answer as long for CPP and Java.

    Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is 
    done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" 
    function to work for non-float data types.

    Input format :
    Integer N
    Output format :
    Corresponding Binary number (long)
    Constraints :
    0 <= N <= 10^5

    Sample Input 1 :
    12
    Sample Output 1 :
    1100 
*/

import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        String result="";
        int value=0;
        sc.close();
        if(num==0){
            System.out.print(num);
            return;
        }
            
        while(num>=1){
            
            value=num%2;
            //System.out.println(result);
            result+=Integer.toString(value);
            num=num/2;
        }
        Long res=Long.parseLong(result);
        int len=result.length();
        while(len>0){
            System.out.print(res%10);
            res/=10;
            len--;
            
        }
    }
}

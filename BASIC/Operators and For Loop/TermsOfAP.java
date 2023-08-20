/*
  Terms of AP

    Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
    Input format :
    Integer x
    Output format :
    Terms of series (separated by space)

    Constraints :
    1 <= x <= 1,000

    Sample Input 1 :
    10
    Sample Output 1 :
    5 11 14 17 23 26 29 35 38 41
*/
import java.util.*;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            int res=3*i+2;
            if(res%4==0){
                num=num+1;
                continue;
            }
            else{
                System.out.print(res+" ");
            }
        }
    }
}

/*
 Sum or Product
    Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose 
    between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
    If C is equal to -
    1, then print the sum
    2, then print the product
    Any other number, then print '-1' (without the quotes)
    
    Input format :
    Line 1 : Integer N
    Line 2 : Choice C
    
    Output Format :
    Sum or product according to user's choice
    Constraints :
    1 <= N <= 12
    
    Sample Input 1 :
    10
    1
    Sample Output 1 :
    55
    Sample Input 2 :
*/

import java.util.*;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int choice=sc.nextInt();
        sc.close();
        if(choice==1){
            int sum=0;
            for(int i=1;i<=num;i++){
                sum+=i;
            }
            System.out.println(sum);
            return;
        }
        else if(choice==2){
            int prod=1;
            for(int i=1;i<=num;i++){
                prod*=i;
            }
            System.out.println(prod);
            return;
            
        }
        else{
            System.out.println("-1");
        }
    }
}

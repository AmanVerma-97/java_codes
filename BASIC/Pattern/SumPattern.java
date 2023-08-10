/*Sum Pattern

Write a program to print triangle of user defined integers sum.

Input Format :
A single integer, N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6

Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15   */



import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        
        while(i<=num){
            if(i==1){
                System.out.print("1=1");
                
            }
            else{
            int j=1;
            while(j<=i){
                if(j<i)
                System.out.print(j+"+");
                else
                System.out.print(j+"="+(i*(i+1))/2);
                
                j=j+1;
            }
            }
            System.out.println();
            i=i+1;
        }
        sc.close();
	}
}

/* Star Pattern

Print the following pattern
Pattern for N = 4

Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
 
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 ******* */



import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            int space=num-i;
            while(space>0){
                System.out.print(" ");
                space=space-1;
            }
            int j=1;
            while(j<=i){
                System.out.print("*");
                j=j+1;
            }
            int k=1;
            while(k<i){
                System.out.print("*");
                k=k+1;
            }
            System.out.println();
            i=i+1;
        }
		sc.close();
	}
}

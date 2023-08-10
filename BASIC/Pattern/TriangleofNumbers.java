/* Triangle of Numbers

Print the following pattern for the given number of rows.
Pattern for N = 4

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
       
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654 */



import java.util.Scanner;

public class TriangleofNumbers {
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
                System.out.print(j);
                j=j+1;
            }
            int k=1;
            int start=(i-k)*2;
            while(k<i){
                System.out.print(start);
                start=start-1;
                k=k+1;
            }
            System.out.println();
            i=i+1;
        }
        sc.close();
	}
}

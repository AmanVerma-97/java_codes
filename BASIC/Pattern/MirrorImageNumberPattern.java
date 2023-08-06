/* Mirror Image Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4

The dots represent spaces.

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50

Sample Input 1:
3
Sample Output 1:
  . . 1 
  . 1 2
  1 2 3
Sample Input 2:
4
Sample Output 2:
. . . 1 
. . 1 2
. 1 2 3
1 2 3 4 */


import java.util.Scanner;

public class MirrorImageNumberPattern {
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
            System.out.println();
            i=i+1;
        }
        sc.close();
	}
}

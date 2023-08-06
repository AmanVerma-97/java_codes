/* Inverted Number Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1 */


import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            int j=num-i+1;
            while(j>0)
            {
                System.out.print(num-i+1);
                j=j-1;
            }
            System.out.println();
            i=i+1;
        }
        sc.close();
	}
}

/* Alpha Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26

Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG

Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF */



import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        char baseChar='A';
        int i=1;
        while(i<=num)
        {
            int j=1;
            while(j<=i){
                System.out.print((char)(baseChar+i-1)); //getting char to be printed using ASCII codes
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
        sc.close();
	}
}

/* Character Pattern

Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 13

Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI */



import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            char baseChar=(char)('A'+i-1);
            int j=1;
            while(j<=i){
                System.out.print((char)(baseChar+j-1));
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
        sc.close();
	}
}

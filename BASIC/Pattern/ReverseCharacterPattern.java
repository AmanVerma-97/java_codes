/* Interesting Alphabets

Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE

Input format :
N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26

Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH*/


import java.util.Scanner;

public class ReverseCharacterPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            char baseChar=(char)('A'+num-i);
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

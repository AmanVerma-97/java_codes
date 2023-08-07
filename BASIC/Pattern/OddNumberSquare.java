/*Odd Square

Write a program to print the pattern for the given N number of rows.

For N = 4
1357
3571
5713
7135

Input Format :
A single integer: N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
135
351
513

Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357 */

import java.util.Scanner;

public class OddNumberSquare {
    public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();
     int currentCol=1;
	 while(currentCol<=num){
		 int valueToPrint=currentCol*2-1;
		 int values=num;

		 while(values>0){
			 System.out.print(valueToPrint);
			 valueToPrint+=2;
			 if(valueToPrint>(2*num-1)){
				 valueToPrint=1;
			 }
			 values--;
		 }
		 currentCol++;
		 System.out.println("");
	 }
     sc.close();
	}
}

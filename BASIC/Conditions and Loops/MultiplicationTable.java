/*Multiplication Table

    Write a program to print multiplication table of n
    Input Format :
    A single integer, n
    Output Format :
    First 10 multiples of n each printed in new line
    Constraints :
    0 <= n <= 10,000 
*/

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int i=1;
	while(i<=10){
		System.out.println(num*i);
		i++;
		}
    sc.close();
	}
}

/*
    Sum Of Array

    Given an array of length N, you need to find and return the sum of all elements of the array.
    Do this recursively.
    Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces

    Output Format :
    Sum
    Constraints :
    1 <= N <= 10^3

    Sample Input 1 :
    3
    9 8 9
    Sample Output 1 :
    26

    Sample Input 2 :
    3
    4 2 1
    Sample Output 2 :
    7    
    
*/


import java.util.Scanner;

public class SumOFArray {

    public static int sum(int input[], int startIndex){ //created to solve the code easilt via recursion.
        if(startIndex==input.length){
            return 0;
        }

        return input[startIndex]+sum(input,startIndex+1);
    }

	public static int sum(int input[]) {  //given as per question.
	return sum(input,0);
	}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
        s.close();
	}
}

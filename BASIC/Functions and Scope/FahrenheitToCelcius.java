/*
    Fahrenheit to Celsius Table

    Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert 
    all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
    Note: You don't have to write the main function or take input. It has already been taken care of. 
    Just write the code that prints Fahrenheit to Celsius table in the function itself.

    Input Format :
    3 integers - S, E and W respectively
    Output Format :
    Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value. Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")
    Constraints :
    0 <= S <= 1000
    0 <= E <= 1000
    0 <= W <= 1000

    Sample Input 1:
    0 
    100 
    20
    Sample Output 1:
    0   -17
    20  -6
    40  4
    60  15
    80  26
    100 37
*/

import java.util.*;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
        s.close();
		printFahrenheitTable(start, end, step);
	}

    public static void printFahrenheitTable(int start, int end, int step) {
		for(int i=start; i<=end; i=i+step){
            int celsius=((i-32)*5)/9;
            System.out.println(i+"\t"+celsius);
        }
		
	}
}

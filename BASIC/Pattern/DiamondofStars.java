/*Diamond of stars

Print the following pattern for the given number of rows.
Note: N is always odd.

Pattern for N = 5

Input format :
N (Total no. of rows and can only be odd)

Output format :
Pattern in N lines

Constraints :
1 <= N <= 49

Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *

Sample Input 2:
3
Sample Output 2:
  *
 ***
  * 

  */



  
import java.util.Scanner;

public class DiamondofStars {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num)
        {
            if(i<=(num+1)/2){
                int spaces=(num+1)/2-i;
                while(spaces>0){
                    System.out.print(" ");
                    spaces=spaces-1;
                }
                int stars=i*2-1;
                while(stars>0){
                    System.out.print("*");
                    stars=stars-1;
                }
            }
            else{
                int spaces=i-(num+1)/2;
                while(spaces>0){
                    System.out.print(" ");
                    spaces=spaces-1;
                }
                int stars=(num-i+1)*2-1;
                while(stars>0){
                    System.out.print("*");
                    stars=stars-1;
                }
                
            }
            System.out.println();
            i=i+1;
        }
        sc.close();
    }
}

/*Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.

Input Format :
A single integer: N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*

Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/



import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();
     int i=1;
	 int k=2*num-1;
     
     if(num==0){
         System.out.println("*");
         System.out.println("*");
     }
        
    else
    {
        
        while(i<=(2*num+1))
        {
            int count=(i+1)/2;
            int j=1;
            while(j<=i)
            {
            if(j==1 || j==i)
            {
                System.out.print("*");
            }
            else
            {
                if(j<=(i+1)/2)
                    System.out.print(j-1);
                else
                {
                    System.out.print(i-count-1);
                    count=count+1;
                }
                        
            }
            j++;
            }
            System.out.println();
            i=i+2; 
        }
	 
        while(k>0)
        {
            int count=(k+1)/2;
            int j=1;
            while(j<=k)
            {
            if(j==1 || j==k)	 
            {
                System.out.print("*");
            }
            else{
                if(j<=(k+1)/2)
                    System.out.print(j-1);
                else
                {
                    System.out.print(k-count-1);
                    count=count+1;
                }
                    
            }
            j++;
            }
            System.out.println();
            k=k-2;
        }
        
    }    
    sc.close();
  }
}

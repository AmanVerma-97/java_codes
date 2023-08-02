/*Total Salary

 Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and 
the grade (an uppercase character), and depending upon which the total salary is calculated as -

    totalSalary = basic + hra + da + allow – pf
    where :
      hra   = 20% of basic
      da    = 50% of basic
      allow = 1700 if grade = ‘A’
      allow = 1500 if grade = ‘B’
      allow = 1300 if grade = ‘C' or any other character
      pf    = 11% of basic.
Round off the total salary and then print the integral part only.*/

import java.util.*;
public class TotalSalary{
	
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int basic=sc.nextInt();

    char grade=sc.next().charAt(0);
    double hra=(basic/10.0)*2;
    double da=(basic/10.0)*5;
    double pf=(basic/100.0)*11;
    double totalSalary=0.0;
    if(grade=='A'){
      totalSalary= basic+hra+da+1700-pf;
    }
    else if(grade=='B'){
      totalSalary= basic+hra+da+1500-pf;
    }
    else{
      totalSalary= basic+hra+da+1300-pf;
    }

    System.out.println(Math.round(totalSalary));
    sc.close();
	}
}

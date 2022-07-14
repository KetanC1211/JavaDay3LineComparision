package com.bridgelabz;
import java.util.*;
public class Line_Comparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Co-ordinate (x1,y1)");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Entered the Co-ordinate is ("+x1+" , "+y1+")");
		System.out.println("Enter the 1st Co-ordinate (x2,y2)");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("Entered the Co-ordinate is ("+x2+" , "+y2+")");
		int z = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
		double length = Math.sqrt(z);
		System.out.println("Length of line is " +length);

		System.out.println("Enter the first Co-ordinate of second line (a1,b1)");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		System.out.println("Entered the Co-ordinate is ("+a1+" , "+b1+")");
		System.out.println("Enter the second Co-ordinate of second line(x2,y2)");
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		System.out.println("Entered the Co-ordinate is ("+a2+" , "+b2+")");
		int z1 = ((a2-a1)*(a2-a1)) + ((b2-b1)*(b2-b1));
		double length2 = Math.sqrt(z1);
		System.out.println("Length of second line is " +length2);
		if(length==length2) {
			System.out.println("Length of lines are equal");
		}
		else if(length>length2){
			System.out.println("Length of first lines is greater");
		}
		else {
			System.out.println("Length of second lines is greater");
		}
	}
}

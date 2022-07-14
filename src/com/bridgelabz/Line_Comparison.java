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
	}
}

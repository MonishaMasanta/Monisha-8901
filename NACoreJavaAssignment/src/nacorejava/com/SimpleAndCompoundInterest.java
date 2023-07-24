package nacorejava.com;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Principal: ");
		int p = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Annual Rate of Interest: ");
		int r = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Time(in yrs.): ");
		int t = sc3.nextInt();
		
		//simple interest
		int s_interest = (p*r*t)/100;
		System.out.println("Simple Interest: "+s_interest);
		
		//compound Interest
		double c_interest = p * Math.pow(1.0+r/100.0,t) - p;
		System.out.println("Compound Interest: "+c_interest);
	}

}

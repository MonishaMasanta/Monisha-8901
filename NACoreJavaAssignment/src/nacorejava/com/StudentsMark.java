package nacorejava.com;

import java.util.Scanner;

public class StudentsMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the marks:");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Subject 1: ");
		int sub1= sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Subject 2: ");
		int sub2= sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Subject 3: ");
		int sub3= sc3.nextInt();
		
		int count = 0;
		if(sub1 > 60) {
			count++;
		}
		if(sub2 > 60) {
			count++;
		}
		if(sub3 > 60) {
			count++;
		}
		
		if(count==3) {
			System.out.println("Passed");
		}
		else if(count==2) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("Failed");
		}
	}

}

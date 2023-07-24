package nacorejava.com;

import java.util.Scanner;

public class NumPresentInArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35,37,7, 52, 86,47};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no u want to check: ");
		int a = sc.nextInt();
		for(int i : arr) {
			if(i == a) {
				System.out.println(a+" is present in the given array");
				
			}
		}
	}

}

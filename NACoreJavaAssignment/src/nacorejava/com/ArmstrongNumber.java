package nacorejava.com;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
	    int temp = n;
		int sum = 0;
			
		while(n!=0) {
            int rem = n%10;
			sum = (sum)+(rem * rem * rem);
			n=n/10;
		}
			
		if(temp == sum) {
			System.out.println(temp+" is an armstrong number");
		}
		else {
			System.out.println(temp+" is not an armstrong number");
		}
	}

}

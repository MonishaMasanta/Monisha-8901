package nacorejava.com;

public class ArmstrongNumberInTheRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
		  int n;
		  System.out.println("Armstrong numbers from 100 - 999 are: "); 
		  for (int i = 100; i <= 999; i++) { 
		       n = i; 
		       while (n != 0) {  
		              int rem = n % 10; 
		              sum = sum + (rem * rem * rem); 
		              n = n / 10; 
		       } 
		       if (i == sum) {
		              System.out.println(i);
		       }
		       sum = 0;
		  }
	}

}

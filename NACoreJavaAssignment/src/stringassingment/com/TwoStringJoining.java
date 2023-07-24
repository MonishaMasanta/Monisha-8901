package stringassingment.com;

public class TwoStringJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello.";
		String str2 = "How are you?";
		String str3 = str1.concat(str2);//using concat method
		String str4 = String.format("%s%s",str1,str2); //using format method
		String str5 = String.join("", str1, str2); //using join method
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
	}

}

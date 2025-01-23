package String_Java_Pragrams;

public class Addsum_Digits_InString {
	public static void main(String[] args) {
		
	String s="a1b2ccr3ts%&n5";
	int sum=0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)>'0' && s.charAt(i)<'9') {
			//int n= s.charAt(i)-48;
			// sum=sum+n;
			sum=sum+ (s.charAt(i)-48);

		}
	}
	System.out.println(sum);
	}
}

package Array_Java_Pragrams;

public class Polyndrome {
	public static void main(String[] args) {
		String s="madam";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			s1=s.charAt(i)+s1;
		}
			if (s.equals(s1)) {
			System.out.println("is polindrome ");	
			}
			else {
				System.out.println("not polindrome");
			}
		}
	}

	



package StringTest;

public class PRACTICE {
	public static void main(String[] args) {
		
		
		String s="a2b3c6";
		String s1=s.replaceAll("[a-z]","");
		String s2=s.replaceAll("[0-9]","");
		System.out.println(s1);
		System.out.println(s2);
		
		
		for(int i=0;i<s1.length();i++) {
			int n=Character.getNumericValue(s1.charAt(i));
				for(int k=0;k<n;k++) {
				System.out.print(s2.charAt(i));
			}
		}
	}
	
	
}

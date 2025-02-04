package String_Java_Pragrams;

import org.testng.annotations.Test;

public class Reverse_Each_Words_InString {
	@Test
	public void REverseEachWord() {
		String s = "welcome to tp office";
		
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			StringBuilder sb = new StringBuilder(s1);
			System.out.print(sb.reverse() + " ");

		}
	}

	@Test
	public void ReverseEachWord() {

		String s ="welcome to tp office";
		String[] arr = s.split(" ");
		String rev = "";
		   
		    for(int i=0;i<=arr.length-1;i++) {
		    	String s2 = arr[i];
		    	
		    	for(int j=s2.length()-1;j>=0;j--) {
		    		rev=rev+s2.charAt(j);
		    	}
		    	rev=rev+" ";
		    }
		    System.out.println(rev);
	}


@Test
public void InplaceOfSpaceUnderscore() {
	String s = "welcome to tp office";
	String arr[] = s.split(" ");
	StringBuilder result =new StringBuilder();
	
	for (int i = 0; i < arr.length; i++) {
		String s1 = arr[i];
		StringBuilder sb = new StringBuilder(s1);
		result.append(sb.reverse());
		if(i<arr.length-1) {
			result.append("_");
		}

	}
	System.out.println(result.toString());
}
}
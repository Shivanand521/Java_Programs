package String_Java_Pragrams;

public class Print_Duplicate_String {
	public static void main(String[] args) {
		String s="aaccddkhaedfdtf";
		String d="";
		for (int i = 0; i < s.length(); i++) {
			if (d.indexOf(s.charAt(i))==-1){
				d=d+s.charAt(i);
				
			} 
		}
		for (int j = 0; j < d.length(); j++) {
			int count=0;
		for (int k = 0; k < s.length(); k++) {
			
			if (d.charAt(j)==s.charAt(k)) {
				count ++;
				
			}
			
		}
		if (count>1) {
			System.out.print(d.charAt(j));
			
		/*
		  Frequency of occurance or how many times repeated
		  
		  System.out.println(d.charAt(j)+ " "+ count +" times ");
		 */
		}
		}
	}
}


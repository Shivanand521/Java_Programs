package String_Java_Pragrams;

public class reverse_wordWithSpace {
	public static void main(String[] args) {
	
	String s ="i love india";
	String rev = "";
	    String[] arr = s.split(" ");
	    for(int i=0;i<=arr.length-1;i++) {
	    	String s2 = arr[i];
	    	for(int j=s2.length()-1;j>=0;j--) {
	    		rev=rev+s2.charAt(j);
	    	}
	    	rev+=" ";
	    }
	    System.out.println(rev);

}
}
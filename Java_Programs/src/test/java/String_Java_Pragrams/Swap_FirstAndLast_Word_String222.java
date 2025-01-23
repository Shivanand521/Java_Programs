package String_Java_Pragrams;

public class Swap_FirstAndLast_Word_String222 {
	public static void main(String[] args) {
	
	String s="My Name is Shiva";
	String s1[]=s.split(" ");
	String str=" ";
	for (int i = 0; i < s1.length; i++) {
		String  temp="";
		if (s1[i]==s1[0]) {
			temp=s1[0];
			s1[0]=s1[s1.length-1];
			s1[s1.length-1]=temp;
			}
		str=str+s1[i]+" ";
	}
	System.out.println(str);
	}
	}
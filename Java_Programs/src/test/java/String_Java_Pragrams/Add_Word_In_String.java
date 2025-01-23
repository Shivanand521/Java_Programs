package String_Java_Pragrams;

public class Add_Word_In_String {
	public static void main(String[] args) {

		String s = "welcome to office"; // welcome to the office
		String[] arr = s.split(" ");
		String op = "";

		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i];
			
			if (arr[i].equals("to")) {
				op = op + temp + " the ";
			} else {
				op = op + arr[i] + " ";
			}

		}

		System.out.println(op);
	}
}

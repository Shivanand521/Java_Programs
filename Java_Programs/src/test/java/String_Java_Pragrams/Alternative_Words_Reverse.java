package String_Java_Pragrams;

import org.testng.annotations.Test;

public class Alternative_Words_Reverse {
	@Test
	public void Reverse_Alternative_Words1() {

		String s = "my name is shiva";
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				char ch[] = arr[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j]);
				}
			} else {
				System.out.print(arr[i]);
			}
		}
	}

	@Test
	public void Reverse_Alternative_Words() {
		String s = "Welcome to tp office";
		String[] arr = s.split(" ");
		String op = "";

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				String s1 = arr[i];
				String rev = "";
				for (int j = s1.length() - 1; j >= 0; j--) {
					rev += s1.charAt(j);
				}
				op = op + rev + " ";
			} else {
				op = op + arr[i] + " ";
			}

		}
		System.out.println(op);
	}

}

package String_Java_Pragrams;

public class Substring {

	public static void main(String[] args) {
		String s = "Shiva";
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				System.out.println(sub);

			}
		}
	}
}

package pattern_Programs;

import org.testng.annotations.Test;

public class Left_Triangle_Number {
	@Test
	public void Left() {
		int n = 4, row = 4, column = 4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
	}

}

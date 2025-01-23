package ArrayTest;

import org.testng.annotations.Test;

public class C_SumOfArray {
	@Test
	public void sum2() {
		int[] a = { 1, 2, 4, 5, 7 };
		int[] b = { 4, 6, 7, 8, 9, 3 };
		int maxLength = Math.max(a.length, b.length);
		int[] sum = new int[maxLength];

		for (int i = 0; i < maxLength; i++) {
			if (i < a.length)
				sum[i] = sum[i] + a[i];

			if (i < b.length)
				sum[i] += b[i];
			System.out.print(sum[i] + " ");
		}
	}

	@Test
	public void sum() {
		int[] a = { 1, 2, 3, 4 };
		int b[] = { 2, 3, 4, 5 };
		if (a.length != b.length) {
			System.out.println("Arrays must have the same length");
			return;
		}
		int[] sum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			sum[i] = a[i] + b[i];
			System.out.print(sum[i] + " ");
		}
	}
}

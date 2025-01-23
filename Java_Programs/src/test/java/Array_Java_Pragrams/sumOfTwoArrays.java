package Array_Java_Pragrams;

import java.util.Arrays;

import org.testng.annotations.Test;
public class sumOfTwoArrays {
	@Test
	public void sum2() {
		int[] a = { 1, 2, 4, 5, 7 };
		int[] b = { 4, 6, 7, 8, 9, 3 };
		int size = Math.max(a.length, b.length);
		int[] sum = new int[size];

		for (int i = 0; i < size; i++) {
			if (i < a.length)
				sum[i] = sum[i] + a[i];

			if (i < b.length)
				sum[i] = sum[i]+b[i];
			System.out.print(sum[i] + " ");
		}
	}
}
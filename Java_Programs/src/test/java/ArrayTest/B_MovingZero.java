package ArrayTest;

import java.util.Arrays;

import org.testng.annotations.Test;

public class B_MovingZero {
	@Test
	public void movingRight() {
		int[] a = { 1, 0, 2, 0, 3, 0, 4, 5, 0 };
		int index = 0;
		int[] ar = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				ar[index++] = a[i];
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	@Test
	public void movingLeft() {
		int[] a = { 1, 0, 2, 0, 3, 0, 4, 5, 0 };
		int last = a.length - 1;
		int ar[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				ar[last--] = a[i];
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}

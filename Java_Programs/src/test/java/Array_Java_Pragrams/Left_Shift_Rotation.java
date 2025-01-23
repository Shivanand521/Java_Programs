package Array_Java_Pragrams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Left_Shift_Rotation {

	@Test
	public void Left_Shift_Rotation() {

		int[] a = { 2, 4, 5, 1, 7, 9 };
		int rotation = 3;
        for (int i = 0; i < rotation; i++) {

			int swap = a[0];
			// swap the second place element to first place
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			// swap the first element to last
			a[a.length - 1] = swap;
		}
		System.out.println(Arrays.toString(a));
	}

	@Test
	public void leftShift() {
		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);

		Collections.rotate(list, -1);
		System.out.println("Array after left shift: " + list);
	}

	@Test
	public void nLeftShift() {
		int n = 2;
		Integer[] array = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);
		Collections.rotate(list, -n);
		System.out.println("Array after left shift: " + list);
	}
}

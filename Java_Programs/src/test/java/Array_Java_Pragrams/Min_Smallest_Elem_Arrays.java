package Array_Java_Pragrams;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Min_Smallest_Elem_Arrays {
	@Test
	public void First_Lowest_Or_Smallest_Elem_Array() {
		int a[] = { 2, 5, 9, 6, 8, 4 };

		// Sorting
        Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

	@Test
	public void Second_smallest_Arrays() {
		int a[] = { 2, 5, 9, 6, 8, 4 };

		// Sorting

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				smin = min;
				min = a[i];

			} else if (a[i] != min && a[i] < smin) {
				smin = a[i];
			}
		}
		System.out.println("First smallest Number :" + min);
		System.out.println("Second smallest Number :" + smin);
	}

	@Test
	public void Third_Smallest_Elem_Arrays() {

		int a[] = { 2, 5, 9, 6, 8, 4, 0 };

		// Sorting
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		int tmin = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				tmin = smin;
				smin = min;
				min = a[i];
			} else if (a[i] != min && a[i] < smin) {
				smin = a[i];

			} else if (a[i] != min && a[i] < tmin) {
				tmin = a[i];
			}
		}
		System.out.println("First smallest Number :" + min);
		System.out.println("Second smallest Number :" + smin);
		System.out.println("Third smallest Number :" + tmin);
	}

}

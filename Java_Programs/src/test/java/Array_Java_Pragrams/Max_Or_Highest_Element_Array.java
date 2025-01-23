package Array_Java_Pragrams;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Max_Or_Highest_Element_Array {
	@Test
	public void first_Max_Or_Highest_Elem_Array() {
		int a[] = { 2, 5, 8, 9, 6, 12, 85, 589 };
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);

	} 

	@Test
	public void Second_Max_Elem_Arrays() {
		int a[] = { 2, 5, 8, 9, 6, 12, 85 };
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				smax = max;
				max = a[i];

			} else if (a[i] != max && a[i] > smax) {
				smax = a[i];

			}
		}
		System.out.println(smax);
	}

	@Test
	public void Third_Max_Elem_Arrays() {

		int a[] = { 2, 5, 8, 9, 6, 12, 85 };

		// Using Sort
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		int tmax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				tmax = smax;
				smax = max;
				max = a[i];

			} else if (a[i] != max && a[i] > tmax) {
				tmax = a[i];

			} else if (a[i] > max && a[i] > smax) {
				smax = a[i];

			}
		}
		System.out.println("First maximum Number :" + max);
		System.out.println("Second maximum Number :" + smax);
		System.out.println("Third maximum Number :" + tmax);
	}

}

package ArrayTest;

import java.util.Arrays;

import org.testng.annotations.Test;

public class E_MaxMin_2 {
	@Test
	public void SecondMax() {
	    int[] a = {1, 2, 3, 5, 6, 6, 7, 0, 2, 7};
	    int max = Integer.MIN_VALUE;
	    int smax = Integer.MIN_VALUE;

	    for (int i = 0; i < a.length; i++) {
	        if (max < a[i]) {
	            smax = max;
	            max = a[i];
	        } else if (smax < a[i] && a[i] != max) {
	            smax = a[i];
	        }
	    }

	    if (smax != Integer.MIN_VALUE) {
	        System.out.println("Second Maximum: " + smax);
	    } else {
	        System.out.println("No Second Maximum Found");
	    }
	}
	@Test
	public void SecondMax2() {
	    int[] a = {1, 2, 3, 5, 6, 6, 7, 0, 2, 7};
	    Arrays.sort(a);
	    int max = a[a.length - 1];
	    int smax = Integer.MIN_VALUE;

	    for (int i = a.length - 2; i >= 0; i--) {
	        if (a[i] < max) {
	            smax = a[i];
	            break;
	        }
	    }

	    if (smax != Integer.MIN_VALUE) {
	        System.out.println("Second Maximum: " + smax);
	    } else {
	        System.out.println("No Second Maximum Found");
	    }
	}
	@Test
	public void SecondMin() {
	    int[] a = {1, 2, 3, 5, 6, 6, 7, 0, 2, 7};
	    int min = Integer.MAX_VALUE;
	    int smin = Integer.MAX_VALUE;

	    for (int i = 0; i < a.length; i++) {
	        if (min > a[i]) {
	            smin = min;
	            min = a[i];
	        } else if (smin > a[i] && a[i] != min) {
	            smin = a[i];
	        }
	    }

	    if (smin != Integer.MAX_VALUE) {
	        System.out.println("Second Minimum: " + smin);
	    } else {
	        System.out.println("No Second Minimum Found");
	    }
	}
	@Test
	public void SecondMin2() {
	    int[] a = {1, 2, 3, 5, 6, 6, 7, 1, 0, 2, 7};
	    Arrays.sort(a);
	    int min = a[0];
	    int smin = Integer.MAX_VALUE;

	    for (int i = 1; i < a.length; i++) {
	        if (a[i] > min) {
	            smin = a[i];
	            break;
	        }
	    }

	    if (smin != Integer.MAX_VALUE) {
	        System.out.println("Second Minimum: " + smin);
	    } else {
	        System.out.println("No Second Minimum Found");
	    }
	}

}


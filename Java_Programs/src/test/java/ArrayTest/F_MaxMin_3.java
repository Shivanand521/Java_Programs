package ArrayTest;

import java.util.Arrays;
import org.testng.annotations.Test;

public class F_MaxMin_3 {
    @Test
    public void ThirdMax() {
        int a[] = {1, 2, 3, 5, 6, 6, 7, 0, 2, 7};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                tmax = smax;
                smax = max;
                max = a[i];
            } else if (smax < a[i] && a[i] != max) {
                tmax = smax;
                smax = a[i];
            } else if (tmax < a[i] && a[i] != max && a[i] != smax) {
                tmax = a[i];
            }
        }
        System.out.println("Third Maximum: " + tmax);
    }

    @Test
    public void ThirdMax2() {
        int[] a = {1, 2, 3, 5, 6, 6, 7, 0, 2, 7};
        Arrays.sort(a);
        int max = a[a.length - 1];
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] < max) {
                smax = a[i];
                break;
            }
        }
        for (int i = a.length - 3; i >= 0; i--) {
            if (a[i] < smax) {
                tmax = a[i];
                break;
            }
        }

        if (tmax != Integer.MIN_VALUE) {
            System.out.println("Third Maximum: " + tmax);
        } else {
            System.out.println("No Third Maximum Found");
        }
    }

    @Test
    public void ThirdMin() {
        int a[] = {1, 2, 3, 5, 6, 7, 0, 2, 7};
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int tmin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                tmin = smin;
                smin = min;
                min = a[i];
            } else if (smin > a[i] && a[i] != min) {
                tmin = smin;
                smin = a[i];
            } else if (tmin > a[i] && a[i] != min && a[i] != smin) {
                tmin = a[i];
            }
        }
        System.out.println("Third Minimum: " + tmin);
    }

    @Test
    public void ThirdMin2() {
        int[] a = {1, 2, 3, 5, 6, 6, 7, 1, 0, 2, 7};
        Arrays.sort(a);
        int min = a[0];
        int smin = Integer.MAX_VALUE;
        int tmin = Integer.MAX_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > min) {
                smin = a[i];
                break;
            }
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] > smin) {
                tmin = a[i];
                break;
            }
        }

        if (tmin != Integer.MAX_VALUE) {
            System.out.println("Third Minimum: " + tmin);
        } else {
            System.out.println("No Third Minimum Found");
        }
    }
}

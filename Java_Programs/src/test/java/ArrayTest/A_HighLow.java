package ArrayTest;

import java.util.Arrays;

import org.testng.annotations.Test;

public class A_HighLow {
	@Test
	public void highest() {
		int a[]= {1,2,3,4,5};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}
	@Test
	public void highest2() {
		int a[]= {1,2,3,4,5};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}
	@Test
	public void lowest() {
		int a[]= {1,2,3,4,5};
		Arrays.sort(a);
		System.out.println(a[0]);
	}
	@Test
	public void lowest2() {
		int a[]= {1,2,3,4,5};
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println(min);
	}
}


package Array_Java_Pragrams;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;


public class Right_Shift_Rotation {
	@Test
	public void Right_Shift_Rotation() {
		
			int[] a = {2,4,5,1,7,9};
			int rotation = 2;
			for(int i = 0; i < rotation; i++) {
				int last = a[a.length-1];
				for(int j = a.length-1; j>0;j--) {
					a[j] = a[j-1];
				}
				a[0] = last;
				
			}
			System.out.println(Arrays.toString(a));
		}

		public class H_RightShift {
		    @Test
		    public void rightShift() {
		        Integer[] array = {1, 2, 3, 4, 5};
		        List<Integer> list = Arrays.asList(array);

		        Collections.rotate(list,1);
		        System.out.println("Array after Right shift: " + list);
		    }

		    @Test
		    public void nRightShift() {
		        int n = 2;
		        Integer[] array = {1, 2, 3, 4, 5};
		        List<Integer> list = Arrays.asList(array);

		        Collections.rotate(list, n);
		        System.out.println("Array after Right shift: " + list);
		    }
		}

}



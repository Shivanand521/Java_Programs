package ArrayTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class G_LeftShift {
	@Test
	public void leftShift() {
	 Integer[] array = {1, 2, 3, 4, 5};
     List<Integer> list = Arrays.asList(array);
     
     Collections.rotate(list, -1);  
     System.out.println("Array after left shift: " + list);
 }
	@Test
	public void nLeftShift() {
		int n=2;
	 Integer[] array = {1, 2, 3, 4, 5};
     List<Integer> list = Arrays.asList(array);
         Collections.rotate(list, -n);
     System.out.println("Array after left shift: " + list);
 }
}
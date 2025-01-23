package ArrayTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

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

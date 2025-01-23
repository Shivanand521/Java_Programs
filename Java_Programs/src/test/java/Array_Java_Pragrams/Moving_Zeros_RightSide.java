package Array_Java_Pragrams;

import java.util.Arrays;

public class Moving_Zeros_RightSide {
	public static void main(String[] args) {
		int a[]= {2,5,0,6,0,8,55,0,56,0};
		int index=0;
		int[] arr=new int [a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=0) { 
				arr[index ++]=a[i];
				
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}

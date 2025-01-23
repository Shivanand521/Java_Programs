package Array_Java_Pragrams;

import java.util.Arrays;

public class Moving_Zeros_LeftSide {
	public static void main(String[] args) {
		int a[]= {2,5,0,6,0,8,55,0,56,0};
		int last=a.length-1;
		int[] arr=new int [a.length];
		for (int i = a.length-1; i >=0; i--) {
			if (a[i]!=0) {
				arr[last --]=a[i];
				
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}

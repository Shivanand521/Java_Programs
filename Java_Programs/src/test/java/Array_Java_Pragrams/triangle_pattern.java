package Array_Java_Pragrams;

import java.util.Iterator;


public class triangle_pattern {
	public static void main (String[] args) {
	int n=3; 
	int star=1,space=2;
	for(int i=1; i<=n ; i++) {
		for (int j = 0; j <=space; j++) {
			System.out.print(" ");
		}
		for (int k = 0; k <=space; k++) {
			System.out.print("*");
		
			}
	space --;
	star ++;
		System.out.println( );
	}
	}
	}

package com.pixated.canopy.ArrayTest;

import org.testng.annotations.Test;

public class I_MergeTwoArray {
  @Test
  public void m1() {
	  int a[]= {1,2,3,4,5};
	  int b[]= {9,8,7,6,5};
	  int c[]=new int[a.length+b.length];
	  for(int i=0;i<c.length-1;i++) {
		  if(i<a.length) 
			  c[i]=a[i];
		  else 
			  c[i]=b[i-a.length];
		  System.out.print(c[i]);
	  }
  }
}

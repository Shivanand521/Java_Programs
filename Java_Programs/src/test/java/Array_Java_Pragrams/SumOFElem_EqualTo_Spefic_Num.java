package Array_Java_Pragrams;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class SumOFElem_EqualTo_Spefic_Num {
	@Test
	public void Sum_OF_Elem_EqualTo_Spefic_Num() {

        int a[]= {10,5,7,8,6,9,9,10,7};
		int target_sum=15;
		
		LinkedHashSet set=new LinkedHashSet();
		for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]+a[j]==target_sum) {
				
				String result=a[i]<a[j]?"("+a[i]+","+a[j]+")" : "("+a[j]+","+a[i]+")";
				set.add(result);
			}
			
		}	
			
		}
		System.out.println(set);
		
		 
	}

}

package Array_Java_Pragrams;

public class remove_duplicate_Array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,2,8,9,0,0,0};
		int visit=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
			if (a[i]==a[j]) {
			a[j]=visit;	
			}		
			}
			if(a[i]!=visit) {
				System.out.println(a[i]);
			}
			 
		} 
	}

}

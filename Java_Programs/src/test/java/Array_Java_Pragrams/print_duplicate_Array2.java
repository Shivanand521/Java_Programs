package Array_Java_Pragrams;

public class print_duplicate_Array2 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 8,8 };
		int visit = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {  
				if (a[i] == a[j]) {
					count++;
					a[j] = visit;
				}

			}
			if (a[i] != visit && count > 1) {
				System.out.println(a[i]);

			}
		}

	}
}

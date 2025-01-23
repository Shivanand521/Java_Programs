package Array_Java_Pragrams;

public class Frequency_OccuranceOF_Array2 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 8, 2, 2, 3, 3, 3, 3, 3 };
		int visit = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					a[j] = visit;
				}

			}
			if (a[i] != visit) {
				System.out.println(a[i] + " is presence " + count + " times");
			}

		}
	}

}

package String_Java_Pragrams;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Print_Unique_Or_Remove_Duplicate_words_InString {
//	public static void main(String[] args) {
//		String s="my  name is shiva my name";
//		String arr[]=s.split(" ");
//		for (int i = 0; i < arr.length; i++) {
//			int count=0;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i].equals(arr[j]) && i!=j) {
//				count++;	
//				}
//				
//			}
//			if (count==0 && !arr.equals("")) {
//				System.out.println(arr[i]);
//				
//				
//			}
//		}
//	}
//
//}


    public static void main(String[] args) {
	String s="my name is shiva my name";
		String arr[]=s.split(" ");
		LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		for (String word : arr) {
			word=word.toLowerCase();
			map.put(word, map.getOrDefault(word,0)+1);
		}
		for (String key : map.keySet()) {
			if (map.get(key)==1) {
				System.out.println(key);
			}
		}
			
		}
			
		}
		
		

 

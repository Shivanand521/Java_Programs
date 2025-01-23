package Othe_Mix_Prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

public class Compare_Two_List {
	@Test
	public void compareString() {
		List<String> list = Arrays.asList("Hi","Hello","Bye");
		List<String> list2 = Arrays.asList("Hi","Welcome","Bye");
		ArrayList result = new ArrayList();
		
		for(String s1 : list2) {
			for(String s2 : list ) {
				if(s1.equals(s2)) {
					result.add(s1);
				}
			}
		}
		System.out.println(result);
	}
	
	@Test
	public void commonElement() {
		List<String> list1 = Arrays.asList("Arjun","Bheem","Krishna","Karna");
		List<String> list2 = Arrays.asList("Bheem","Karna");
		
		List<String> common=new ArrayList<String>(list1);
		common.retainAll(list2);
		System.out.println(common);
	}


@Test
public void Compare_Two_List2() {
	ArrayList<String> ar= new ArrayList<String>();
	
	ar.add("abc");
	ar.add("def");
	ar.add("ghi");
	
	ArrayList<String> ar1= new ArrayList<String>();
	
	ar1.add("bc");
	ar1.add("def");
	ar1.add("hi");         // o/p:--->  {abc=false, def=true, ghi=false}
	
	HashMap<String, Boolean> hs=new HashMap<String, Boolean>();
	
	for (String string : ar) {
		
		if(ar1.contains(string))
		{
			hs.put(string, true);
		}
		else
		{
			hs.put(string, false);
		}
	}
	System.out.println(hs);
	
}

}
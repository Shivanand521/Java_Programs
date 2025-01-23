package StringTest;

import org.testng.annotations.Test;

public class O_Remove_Char {
	@Test
	public void removeNumber() {
	 String str = "Hello123 World456!";
	        String result = str.replaceAll("[0-9]", "");
	        System.out.println(result);
}
	@Test
	public void removeSpclChar() {
	 String str = "Hello123 World456!";
	 String result = str.replaceAll("[^a-zA-Z0-9]", "");
	        System.out.println(result);
	        String result2 = str.replaceAll("[0-9]", "");
	        System.out.println(result2);        
}
}

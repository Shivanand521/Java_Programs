package StringTest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class E_OccuranceOfWOrd {
	@Test
	public void occur(){
		String sentence = "gd mrng betu gd";
		String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
	}
}


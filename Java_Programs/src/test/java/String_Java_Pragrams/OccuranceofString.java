package String_Java_Pragrams;

import java.util.LinkedHashMap;

public class OccuranceofString {
	public static void main(String[] args) {
        String s="abbbcca";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1) ;
            }
            else{
                map.put(ch,1);
            }
        }
        
        System.out.println(map);
    }
}



package com.pixated.canopy.StringTest;
import java.util.ArrayList;
import java.util.Stack;

import org.testng.annotations.Test;

public class L_BalanceString {
	@Test
    public void s() {
        String s = "()[(]{}(";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (list.size() > 0 &&
                ((ch == '}' && list.get(list.size() - 1) == '{') ||
                 (ch == ']' && list.get(list.size() - 1) == '[') ||
                 (ch == ')' && list.get(list.size() - 1) == '('))) 
                list.remove(list.size() - 1);
            else 
                list.add(ch);
        }

        if (list.isEmpty()) 
            System.out.println("String is balanced");
       else 
            System.out.println("String is not balanced");
    }
	@Test
    public void s2() {
	 String s = "()[(]{}(";
     Stack<Character> stack = new Stack<>();

     for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);

         if (ch == '(' || ch == '{' || ch == '[') {
             stack.push(ch);
         } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
             stack.pop();
         } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
             stack.pop();
         } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
             stack.pop();
         } else {
             stack.push(ch);
         }
     }

     if (stack.isEmpty()) {
         System.out.println("String is balanced");
     } else {
         System.out.println("String is not balanced");
     }
 }
}

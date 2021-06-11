package Bracket;

import java.util.Stack;

public class Bracket {

	public static boolean bracket(String s) {
		if(s.length()%2!=0)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case ')':
				if(stack.peek()=='(') //다음 항목 확인
					stack.pop();
				break;
			case '}':
				if(stack.peek()=='{')
					stack.pop();
				break;
			case ']':
				if(stack.peek()=='[')
					stack.pop();
				break;
			default :
				stack.push(s.charAt(i));
				break;
			}
		}
		return stack.empty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bracket("(){}[]"));
	}

}

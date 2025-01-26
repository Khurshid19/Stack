import java.util.*;
//import java.util.Stack;

public class PushAtBottom {
	public static void pushBottom(Stack<Integer> s, int  data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushBottom(s,data);
		s.push(top);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s= new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		pushBottom(s,4);
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}

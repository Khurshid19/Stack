import java.util.Stack;

public class BottomPush {
	
	public static void pushBottom(Stack<Integer> s, int  data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushBottom(s,data);
		s.push(top);
	}
	public static void reverseStack(Stack<Integer>s) {
		if(s.isEmpty()) {
			return;
		}
		int top=s.pop();
		reverseStack(s);
		pushBottom(s,top);
		
	}
	public static void printStack(Stack<Integer>s) {
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		
		reverseStack(s);
		printStack(s);

	}

}

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> s =new Stack <>();
		
		s.push("a");
		s.push("b");
		s.push("c");
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		

	}

}

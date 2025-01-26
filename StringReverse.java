import java.util.*;

public class StringReverse {
	public static String ReverseString(String str) {
		Stack<Character>s=new Stack <>();
		int idx=0;
		
		while(idx < str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		StringBuilder result =new StringBuilder("");
		while(!s.isEmpty()) {
			char curr = s.pop();
			result.append(curr);
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloWorld";
		String result=ReverseString(str);
		System.out.println(result);
	}

}

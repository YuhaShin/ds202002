import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static boolean isValid(String pp) {
		
		char[] stack = new char[1024];
		int top = -1;
		
		for(int i=0; i<pp.length(); i++) {
			char ch = pp.charAt(i);
			if(ch == '(') {
				stack[++top] = ch;
			}
			else if(ch == ')') {
				if(top == -1 || stack[top] != '(') return false;
				top--;
			}
		}
		
		return top == -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n2 = sc.nextInt();
		ArrayList<String> ans2 = new ArrayList();
		String[] b = new String[n2];
		for (int i=0; i<n2; i++) {
			b[i] = sc.next();
		}
		for (int i=0; i<n2; i++) {
			if(isValid(b[i])) ans2.add("YES");
			else ans2.add("NO");
		}
		for (String s : ans2) {
			System.out.println(s);
		}
	}

}

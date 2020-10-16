import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	
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
		System.out.println("1874. 스택 수열");
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack();
		ArrayList<String> ans = new ArrayList();
		
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int m = 1;
		
		for (int i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i=1; i<=n; i++) {
			st.push(i);
			ans.add("+");
			while (!st.empty() && st.peek() == a[m]) {
				st.pop();
				ans.add("-");
				m++;
			}
		}
		
		if (st.empty()) {
			for (String s : ans) {
				System.out.println(s);
			}
		} else {
			System.out.println("NO");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		System.out.println("9012. 괄호");
		
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

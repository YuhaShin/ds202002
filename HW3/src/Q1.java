import java.util.Random;
import java.util.Scanner;

class Stack<E> {
	E[] data;
	int top;
	
	Stack() {
		data = (E[])new Object[10001];
		top = -1;
	}
	public void push(E v) {
		top++;
		data[top] = v;
	}
	public void pop() {
		data[top] = null;
		top--;
	}
	public E top() {
		return data[top];
	}
	public boolean empty() {
		return top == -1;
	}
	public int size() {
		return top+1;
	}

}


class Queue<E> {
	int front;
	int rear;
	E[] data;
	int size;
	Queue() {
		front = 0;
		rear = 0;
		size = 10001;
		data = (E[])new Object[size];
	}
	public void add(E v) {
		data[rear] = v;
		rear = (rear+1)%size;
	}
	public void remove() {
		data[front] = null;
		front = (front+1)%size;
	}
	public E peek() {
		return data[front];
	}
	public boolean empty() {
		return front==rear;
	}
	public int size() {
		return (rear-front+size)%size;
	}
}

public class Q1 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack();
		Queue<Integer> queue = new Queue();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Random rand = new Random(10000);
		for(int i=0;i<n;i++) {
			queue.add(rand.nextInt());
		}
		
		
		
		while(queue.empty()) {
			
			if(stack.empty()||stack.top()>=queue.peek()) {
				stack.push(queue.peek());
				queue.remove();
			}
			else {
				queue.add(stack.top());
				stack.pop();
			}
			
		}
		
		for(int i=0; i<stack.size(); i++) {
			System.out.println(stack.top());
			stack.pop();
		}
		
	
	}

}

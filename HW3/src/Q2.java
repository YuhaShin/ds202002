import java.util.Scanner;

class Queue1 {
	int front;
	int rear;
	int[] data;
	int size;
	Queue1() {
		front = 0;
		rear = 0;
		size = 10001;
		data = new int[size];
	}
	public void push(int v) {
		rear = (rear+1)%size;
		data[rear] = v;
	}
	public int pop() {
		if(empty()) return -1;
		else {
			front = (front+1)%size;
			return data[front-1];
		}
		
	}
	public int front() {
		if(empty()) return -1;
		else return data[front];
	}
	public int back() {
		if(empty()) return -1;
		else return data[rear];
	}
	public boolean empty() {
		return front==rear;
	}
	public int size() {
		return (rear-front+size)%size;
	}
}

public class Q2 {

	public static void main(String[] args) {
		Queue1 queue = new Queue1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String order = sc.next();
			switch(order) {
			case "push":
				int x = sc.nextInt();
				queue.push(x);
				break;
			case "pop":
				System.out.println(queue.pop());
				break;
			case "empty":
				if(queue.empty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				System.out.println(queue.front());
				break;
			case "back":
				System.out.println(queue.back());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			}
		}
	
		
	}

}

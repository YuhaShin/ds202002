import java.util.Scanner;

// Lab 10. ������׷� ���� Ǯ��
// ���������� �̿��Ͽ� ������׷����� ���� ū ������ ���簢�� ���ϱ�
// �Է�
// ó���� ������׷��� ���� ���� N�� �Է��մϴ�.
// ������ �� ���õ��� �������� N�� �Է��մϴ�.
public class Main {
	//  ���������� ���� �Լ�
	//  �迭 v���� ���� (a,b) �������� �ִ� ũ���� ���簢�� ���� ��ȯ
	static int histo(int[] v, int a, int b) {
		return 0;
	}
	//  ������׷����� �ִ��� ���簢�� ���̸� ����ؼ� ����ϴ� �Լ�
	//  v : ������׷��� ���õ��� �������� �迭 (0 �̻��� �ڿ���)
	//  n :  ������ ����
	static int histo(int[] v, int n) {
		if(n==1) return v[0];
		int mid = n/2;
		//  v[0..n-1] ������ ���̸� ���ؼ� �� ���� ��ȯ�մϴ�.
		return histo(v, 0, n-1);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] v = new int[n];
		
		for(int i=0; i<n; i++) {
			v[i] = sc.nextInt();
		}
		//  histo() �Լ��� ȣ���ؼ� �� ��� ����
		int r = histo(v, n);
		// ��� ���
		System.out.println(r);
		
		
		
	}

}

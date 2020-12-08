import java.util.Scanner;

// Lab 10. 히스토그램 문제 풀기
// 분할정복을 이용하여 히스토그램에서 가장 큰 넓이의 직사각형 구하기
// 입력
// 처음에 히스토그램의 샘플 갯수 N을 입력합니다.
// 다음에 각 샘플들의 도수들을 N개 입력합니다.
public class Main {
	//  분할정복을 위한 함수
	//  배열 v에서 범위 (a,b) 구간에서 최대 크기의 직사각형 넓이 반환
	static int histo(int[] v, int a, int b) {
		return 0;
	}
	//  히스토그램에서 최대의 직사각형 넓이를 계산해서 출력하는 함수
	//  v : 히스토그램의 샘플들의 도수들의 배열 (0 이상의 자연수)
	//  n :  샘플의 갯수
	static int histo(int[] v, int n) {
		if(n==1) return v[0];
		int mid = n/2;
		//  v[0..n-1] 구간의 넓이를 구해서 그 값을 반환합니다.
		return histo(v, 0, n-1);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] v = new int[n];
		
		for(int i=0; i<n; i++) {
			v[i] = sc.nextInt();
		}
		//  histo() 함수를 호출해서 그 결과 저장
		int r = histo(v, n);
		// 결과 출력
		System.out.println(r);
		
		
		
	}

}

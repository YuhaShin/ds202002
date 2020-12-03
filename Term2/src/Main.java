import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		Random rand = new Random(100);
		int[] v = new int[n+1];
		for(int i=1;i<=n;i++) {
			v[i] = rand.nextInt(100);
		}
		for(int i=0;i<k;i++) {
			int a = rand.nextInt(n)+1;
			int b = rand.nextInt(n)+1;
			int start, end;
			if(a<=b) {
				start = a;
				end = b;
			}
			else {
				start = b;
				end = a;
			}
			int max = v[start];
			int min = v[start];
			int hap = 0;
			
			for(int j=start;j<=end;j++) {
				if(max <= v[j]) max = v[j];
				if(min >= v[j]) min = v[j];
				hap += v[j];
				count++;
			}
			
			System.out.println(max+" "+min+" "+hap);
			count++;
		}		
		
		System.out.println("count = "+count);
	}

}

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Random rand = new Random(100);
		int[] v = new int[n+1];
		for(int i=1;i<=n;i++) {
			v[i] = rand.nextInt();
		}
		
		int max = v[a];
		int min = v[a];
		int hap = 0;
		
		for(int i=a;i<=b;i++) {
			if(max <= v[i]) max = v[i];
			if(min >= v[i]) min = v[i];
			hap += v[i];
		}
		System.out.println(max+" "+min+" "+hap);
		
		
	}

}

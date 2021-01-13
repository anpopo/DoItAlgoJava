package chap01;

import java.util.Scanner;

public class Practice_Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n/2; i++ ) {
			sum += (1 + n);
			
		}
		
		if (!(n % 2 == 0)) {
			sum += (1 + n / 2);
		}
		
		System.out.println("sum = " + sum);
		
	}
}

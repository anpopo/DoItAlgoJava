package chap01;

import java.util.Scanner;

public class Practice_Q11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n ;
		
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			n = sc.nextInt();
			
		} while (n <= 0);
		
		int count = 0;
		
		
		do {
			
			n = n / 10;
			count++;
			
			
		} while (n > 0);
		
		System.out.println("그 수는 " + count + "자리 입니다.");
		
	}
}

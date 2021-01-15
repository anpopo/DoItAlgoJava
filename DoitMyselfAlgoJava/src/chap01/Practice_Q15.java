package chap01;

import java.util.Scanner;

public class Practice_Q15 {
	static void triangleLB(int m) {  // 왼쪽 아래가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int m) {  // 왼쪽 위가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= m - i +1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int m) {  // 오른쪽 위가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= m - i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	static void triangleRB(int m) {  // 오른쪽 아래가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= m-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		int n, m;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			do {
				System.out.print("만들 프로그램을 입력하세요. 1 / 2 / 3 / 4 / 5(나가기)\n>>> ");
				n = sc.nextInt();				
			} while (n <= 0);
			
			if (n == 5) {
				break;
			}
			
			do {
				System.out.print("단수 : ");
				m = sc.nextInt();				
			} while (m <= 0);
			
			
			switch (n) {
			
			
			case 1:
				triangleLB(m);
				break;
			case 2:
				triangleLU(m);
				break;
			case 3:
				triangleRU(m);
				break;
			case 4:
				triangleRB(m);
				break;
			
			}
			
		} while (n != 5);
		
		
	}
	
	
}

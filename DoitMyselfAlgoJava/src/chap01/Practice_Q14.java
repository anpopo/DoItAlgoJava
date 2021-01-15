package chap01;

import java.util.Scanner;

public class Practice_Q14 {
	public static void main(String[] args) {
		
		System.out.println("사각형을 출력합니다.");
		
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.print("단  수 : ");
			num = sc.nextInt();
		} while (num <= 0);
		
		for (int i=0; i< num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}

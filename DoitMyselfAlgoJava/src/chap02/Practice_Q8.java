package chap02;

import java.util.Scanner;

public class Practice_Q8 {
	static int[][] mdays = { { 31, 28, 31, 20, 31, 20, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 20, 31, 20, 31, 31, 30, 31, 30, 31 } };

	static int isLeap(int year) { // 평년 : 0 , 윤년 : 1
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {

		while(--m != 0) {
			d += mdays[isLeap(y)][m-1];
		}

		return d;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int retry; // 다시한번

		System.out.println("그 해 경과 일수를 구합니다.");

		do {

			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();

			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			System.out.print("한번 더 할깝쇼?????(1.예 / 0.아니오) : ");
			retry = sc.nextInt();

		} while (retry == 1);

	}
}

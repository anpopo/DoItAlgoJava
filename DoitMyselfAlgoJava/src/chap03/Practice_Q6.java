package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("오름차순으로 입력하세요.");

		System.out.print("a[0]：");
		a[0] = sc.nextInt();
		
		for(int i = 1; i < a.length; i++) {
			do {
				System.out.print("a[" + i + "]：");
				a[i] = sc.nextInt();
			} while (a[i] < a[i - 1]);
		}
		
		System.out.print("찾는 값：");
		int ky = sc.nextInt();
		
		
		int idx = Arrays.binarySearch(a, ky);
		
		if (idx < 0)
			System.out.println("그 값의 요소가 없습니다. 삽입 포인트의 값은 " + idx + "입니다.");
		else
			System.out.println(ky + "의 요소는  a[" + idx + "]에 있습니다.");
		
		
	
	}
}

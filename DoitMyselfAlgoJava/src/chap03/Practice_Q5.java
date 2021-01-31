package chap03;

import java.util.Scanner;

public class Practice_Q5 {
	static int binSearchX(int[] a, int n, int key ) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) {
				int temp = a[pc];
				int rIdx = pc;
				
				while(temp == a[--pc]) {
					rIdx -= 1;
				}
				return rIdx;
			}
			else if (a[pc] < key) pl = pc + 1;
			else if (a[pc] > key) pr = pc - 1;
		} while (pl <= pr);
		return -1;
	}
	
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
		
		
		int idx = binSearchX(a, n, ky);
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "의 제일 앞 요소는  a[" + idx + "]에 있습니다.");
		
	}
}

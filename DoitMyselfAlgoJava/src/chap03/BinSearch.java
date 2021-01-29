package chap03;

import java.util.Scanner;

public class BinSearch {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;			// 검색 범위 첫 인덱스
			
		int pr = n-1;		// 검색 범위 마지막 인덱스
		
		
		do {
			int pc = (pl + pr)/ 2;
			
			if(a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
				
			}
		} while (pl <= pr);
		
		return -1;
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("오름차순 입력 부탁드려용");
		
		
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for (int i = 1; i < x.length; i++) {
			
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
				
			} while (x[i] < x[i - 1]);
			
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그값의 요소가 없습니다.");
			
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
		
	}
}

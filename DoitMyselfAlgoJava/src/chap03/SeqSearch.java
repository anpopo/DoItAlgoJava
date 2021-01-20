package chap03;

import java.util.Scanner;

public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if (i == n)  // 배열의 모든 인덱스를 다 돌고도 값이 없는 경우(배열의 크기와 i값이 같아진다)
				return -1;
			if (a[i] == key)  // 중간에서 찾는 경우
				return i;
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
			
		}
		
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		
		int idx = seqSearch(x, num, key);
		
		if (idx == -1) {
			System.out.println("요소값이 없음");
		} else {
			System.out.println(key + "는(은) x[" + idx + "]에 있습니다");
		}
		
	}
}

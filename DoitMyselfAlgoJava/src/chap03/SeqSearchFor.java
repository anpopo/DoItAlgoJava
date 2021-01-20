package chap03;

import java.util.Scanner;

public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
		
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

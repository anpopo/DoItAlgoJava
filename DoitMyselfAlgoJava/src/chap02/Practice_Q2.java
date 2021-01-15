package chap02;

import java.util.Scanner;

public class Practice_Q2 {
	
	static void swap (int[] a, int x, int y) {
		
		int t = a[x];
		a[x] = a[y];
		a[y] = t;
		
	}
	
	static void reverse(int[] a) {
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			System.out.println("a[" + i + "]와(과) a[" + (a.length - i - 1) + "]를 교환합니당");
			
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
			
		}
		
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		
		
		
	}
	
}

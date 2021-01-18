package chap02;

import java.util.Scanner;

public class Practice_Q5 {
	static int[] rcopy(int[] a, int[] b) {
		a = new int[b.length];
		
		
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length - 1 - i];
			
		}
		
		return a;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = sc.nextInt();
		
		int[] a = new int[na];
	
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i ++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
			
		}
		
		
		
		a = rcopy(a, b);
		
		for (int temp : a) {
			System.out.println(temp);
		}
		
		System.out.println();
		
		for (int temp : b) {
			System.out.println(temp);
		}
		
	}
}

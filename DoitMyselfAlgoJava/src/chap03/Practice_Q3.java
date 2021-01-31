package chap03;

import java.util.Scanner;

public class Practice_Q3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				idx[count] = i;
				count += 1;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int n = sc.nextInt();
		
		
		int[] a = new int[n];
		
		System.out.print("key : ");
		int key = sc.nextInt();
		
		int[] idx = new int[n];
		
		
		int count = searchIdx(a, n, key, idx);
		
		if (count == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			for (int i = 0; i < count; i++)
				System.out.println("그 값은 " + "x[" + idx[i] + "]에 있습니다.");
		
		
	}
}

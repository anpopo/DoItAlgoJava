package chap01;

public class Practice_Q4 {
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a > c) {
				return c;
			} else
				return a;
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else
			return b;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
			System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
			System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
			System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
			System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
			System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
			System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
			System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
			System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
			System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
			System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
			System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
			System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
		}

		long end = System.currentTimeMillis();

		System.out.println();
		System.out.println("걸린시간 : " + (end - start) + "ms");
	}
}

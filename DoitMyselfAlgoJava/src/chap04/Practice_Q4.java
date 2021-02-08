package chap04;

public class Practice_Q4 {
	
	private int max;  // 큐의 용량
	private int num;  // 현재 데이터 수
	private int[] que;  // 큐 본체 배열
	
	// 런타임 예외 : 큐가 비어있음
	public class EmptyException extends RuntimeException {
		public EmptyException() {
		}
	}
	// 런타임 예외 : 큐가 가득 참

	public class OverflowException extends RuntimeException {
		public OverflowException() {
		}
	}
	
	public Practice_Q4(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];			
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 큐에 데이터를 넣어줌 
	public int enque(int x) throws OverflowException{
		if(num >= max) {
			throw new OverflowException();
		}
		que[num++] = x;
		return x;
	}
	
	// 큐에서 데이터를 빼냄
	public int deque() throws EmptyException{
		if (num <= 0) {
			throw new EmptyException();
		}
		int x = que[0];
		for (int i = 0; i < num - 1; i ++) {
			que[i] = que[i + 1];
			
		}
		num--;
		return x;
	}
	
	// 가장 나중에 들어온 데이터를 살펴봄 
	public int peek() throws EmptyException{
		if(num <= 0) {
			throw new EmptyException();
		}
		return que[num-1];
	}
	
	public int indexOf(int x) {
		for(int i= 0; i < num; i++) {
			if(que[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size () {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비었습니다.");
		} else {
			for(int i = 0; i < num; i++) {
				System.out.print(que[i] + " ");
			}
			System.out.println();
			
		}
	}
	
	
}

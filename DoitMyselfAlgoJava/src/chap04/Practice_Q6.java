package chap04;

public class Practice_Q6<E> {
	private int max;
	private int num;
	private int front;
	private int rear;
	private E[] que;
	
	public Practice_Q6(int capacity) {
		max = capacity;
		num = front = rear = 0;
		
		try {
			que = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public static class EmptyException extends RuntimeException {
		public EmptyException() {
		
		}
	}
	
	public static class OverflowException extends RuntimeException {
		public OverflowException() {
		}
	}
	
	public E enque (E x) throws OverflowException{
		
		if(num >= max) {
			throw new OverflowException();
		}
		que[rear++] = x;
		num++;
		
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	public E deque () throws EmptyException{
		
		if(num <= 0) {
			throw new EmptyException();
		}
		
		E x = que[front++];
		num--;
		if (front == max) {
			front = 0;
		}
		
		return x;
		
	}
}

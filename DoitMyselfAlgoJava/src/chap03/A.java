package chap03;


// 직접 만든 클래스에 대한 자연 정렬이 필요한다면
// 다음과 같은 방식으로 클래스를 정렬 해 주면 된다.

public class A implements Comparable<A>{
	
	public int compareTo(A c) {
		// this 가 c보다 크면 양의 값 반환
		// this 가 c보다 작으면 음의 값 반환
		// this 가 c와 같으면 0 반환
		
	}
	
	public boolean equals(Object c) {
		// this가 c와 같으면 true 반환
		// this 가 c와 같지 않으면 false 반환
	}
}

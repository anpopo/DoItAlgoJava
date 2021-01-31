package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Practice_Q7 {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		@Override
		public String toString() {
			return name + " " + height + " " + vision;
			
		}
		
		public static final Comparator<PhyscData> VISION_DISC = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData> {
			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				
				return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {
				
				new PhyscData("이수민", 175, 2.0),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("이나령", 162, 0.3)	
		};
		
		System.out.print("시력이 몇인 사람을 찾고 계십니까유? : ");
		double height = sc.nextDouble();
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, height), PhyscData.VISION_DISC);
		
		
		if (idx < 0) System.out.println("요소가 없습니다.");
		else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
	}
}

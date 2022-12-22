package ch03;

public class prac {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {90, 90, 80};
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.printf("sum: %d\n", sum);
		
		int sum2 = add( new int[] {90, 90, 80});
		System.out.printf("sum: %d\n", sum2);
		System.out.println();	
	}

	private static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
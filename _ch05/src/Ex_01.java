
public class Ex_01 {

	public static void main(String[] args) {
//		int[] score; // 배열 score를 선언(참조변수 선언)
//		score= new int[5]; // 배열 생성

		int[] score = new int[5]; // 배열의 선언과 생성을 동시에
		score[3] = 100;

		System.out.println("score[0] = " + score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		System.out.println("score[3] = " + score[3]);
		System.out.println("score[4] = " + score[4]);

		int value = score[3];
		System.out.println("value = " + value);
	}

}

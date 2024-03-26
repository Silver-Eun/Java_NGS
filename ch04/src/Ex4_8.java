class Ex4_8 {
	public static void main(String args[]) {
		// 괄호 안의 문장을 3번 반복
//		for (int i = 1; i <= 3; i++) {
//		for (int i = 1; i <= 10; i = i * 2) {
//			System.out.println("Hello");
		for (int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i=" + i + ", j=" + j);
		}
	}
}
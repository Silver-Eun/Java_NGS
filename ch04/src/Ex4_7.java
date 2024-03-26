class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		for (int i = 1; i <= 5; i++) {
//			num = (int) (Math.random() * 6) + 1;
//			System.out.println(num);
			System.out.println(Math.random()); // 0.0 <= x < 1.0
			System.out.println(Math.random()*10); // 0.0 <= x < 10.0
			System.out.println((int)(Math.random()*10)); // 0 <= x < 10
			System.out.println((int)(Math.random()*11)); // 0 <= x < 11
			System.out.println((int)(Math.random()*11)-5); // -5 <= x < 6
		}
	}
}
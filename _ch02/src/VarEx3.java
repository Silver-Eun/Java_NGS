
public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
//		score = 200;
		System.out.println(score);

		boolean power = true;
		System.out.println(power);

		byte b = 127;

		// 8진수
		int oct = 010;
		// 16진수
		int hex = 0x10;

		System.out.println(oct);
		System.out.println(hex);

		long l = 10_0000_0000;

		System.out.println(l);
		
		float f = 3.14f;
		double d = 3.14f;
		System.out.println(f);
		System.out.println(d);

		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}

}

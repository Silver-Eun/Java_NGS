
public class VarEx3 {

	public static void main(String[] args) {
		int x = 4, y = 2;

		int tmp;

		tmp = x; // x의 값을 tmp에 저장
		x = y;   // x의 값을 y에 저장
		y = tmp; // tmp의 값을 y에 저장

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}

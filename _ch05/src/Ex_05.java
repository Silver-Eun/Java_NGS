public class Ex_05 {

	public static void main(String[] args) {
		String str = "ABCDE";
		char ch = str.charAt(0);
		String str2 = str.substring(1, 4);
		String str3 = str.substring(1);
		String str4 = str.substring(1, str.length());
		System.out.println("ch = " + ch);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
	}

}
